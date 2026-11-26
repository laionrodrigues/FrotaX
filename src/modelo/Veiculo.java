package modelo;

import util.VerificarString;

import java.time.Year;

public abstract class Veiculo {
    private int id;
    private String placa;
    private String tipo;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double precoBase;
    private boolean disponivel;

    public Veiculo(String placa, String tipo, String marca, String modelo, int anoFabricacao, double precoBase){
        setPlaca(placa);
        setTipo(tipo);
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setPrecoBase(precoBase);
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
            throw new IllegalArgumentException("Placa inválida.");
        }
        if (!VerificarString.validarPlaca(placa)) {
            throw new IllegalArgumentException("Placa inválida. Placa deve conter 7 caracteres de (A-Z) e (0-9)");
        }
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if ((tipo.equalsIgnoreCase("caminhao"))) {
            throw new IllegalArgumentException("Tipo inválido. É necessário acento ~ no caminh(a)o ");
        }
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("Tipo de veículo inválido.");
        }
        if (!(tipo.equalsIgnoreCase("carro")
                || tipo.equalsIgnoreCase("caminhão")
                || tipo.equalsIgnoreCase("moto")
                || tipo.equalsIgnoreCase("camionete"))) {
            throw new IllegalArgumentException("Tipo de veiculo inválido.");
        }
        tipo = VerificarString.formatarString(tipo);
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido.");
        }
        modelo = VerificarString.formatarString(modelo);
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca inválida.");
        }
        marca = VerificarString.formatarString(marca);
        this.marca = marca;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if (precoBase < 0.0) {
            throw new IllegalArgumentException("Preço inválido.");
        }
        this.precoBase = precoBase;
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
