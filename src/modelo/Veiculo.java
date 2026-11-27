package modelo;

import util.VerificarString;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;

public abstract class Veiculo {
    private int id;
    private String placa;
    private String tipo;
    private String marca;
    private String modelo;
    private int anoFabricacao;  
    private BigDecimal precoBase;
    private boolean disponivel;

    public Veiculo(String placa, String tipo, String marca, String modelo, int anoFabricacao, BigDecimal precoBase){
        setPlaca(placa);
        setTipo(tipo);
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setPrecoBase(precoBase);
        setDisponivel(true);
    }

    public String toString() {
        return  "ID: " + getId() + "\nTIPO: " + getTipo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("O campo placa não pode estar vazio.");
        }
        if (!VerificarString.validarPlaca(placa)) {
            throw new IllegalArgumentException("Placa inválida. Placa deve conter 7 caracteres de (A-Z) e (0-9)");
        }
        placa = VerificarString.formatarTodasLetrasMaiusculas(placa);
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("O campo tipo não pode estar vazio.");
        }
        if ((tipo.equalsIgnoreCase("caminhao"))) {
            throw new IllegalArgumentException("Tipo inválido. É necessário acento ~ no caminh(a)o ");
        }
        if (!(tipo.equalsIgnoreCase("carro")
                || tipo.equalsIgnoreCase("caminhão")
                || tipo.equalsIgnoreCase("moto")
                || tipo.equalsIgnoreCase("camionete"))) {
            throw new IllegalArgumentException("Tipo de veiculo inválido.\nApenas carro, moto, camionete ou caminhão.");
        }
        tipo = VerificarString.formatarPrimeiraLetraMaiuscula(tipo);
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("O campo modelo não pode estar vazio.");
        }
        modelo = VerificarString.formatarPrimeiraLetraMaiuscula(modelo);
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("O campo marca não pode estar vazio.");
        }
        marca = VerificarString.formatarPrimeiraLetraMaiuscula(marca);
        this.marca = marca;
    }

    public BigDecimal getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(BigDecimal precoBase) {
        if (precoBase == null) {
            throw new IllegalArgumentException("O campo preço base não pode estar vazio.");
        }
        if (precoBase.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O preço base deve ser maior que 0.");
        }
        this.precoBase = precoBase.setScale(2, RoundingMode.HALF_EVEN);
    }

    public abstract int getHorasAlugadas();

    public void setAnoFabricacao(int anoFabricacao) {
        int anoMinimo = Year.now().plusYears(-6).getValue();
        int anoMaximo = Year.now().plusYears(1).getValue();

        if (anoFabricacao < anoMinimo || anoFabricacao > anoMaximo) {
            throw new IllegalArgumentException("Ano inválido. O ano deve ser entre " + anoMinimo + " e " + anoMaximo + ".");
        }

        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
