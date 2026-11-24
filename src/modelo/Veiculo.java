package modelo;

import java.time.Year;

public abstract class Veiculo {
    private int id;
    private String placa;
    private String tipo;
    private String modelo;
    private String marca;
    private Year anoFabricacao;

    public Veiculo(String placa, String tipo, String modelo, String marca, Year anoFabricacao){
        setPlaca(placa);
        setTipo(tipo);
        setModelo(modelo);
        setMarca(marca);
        setAnoFabricacao(anoFabricacao);
    }

    public String toString() {
        return  "MARCA: " + getMarca() + "\nTIPO: " + getTipo() + "\nID: " + getId();
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Placa inválida");
        }
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("Tipo de veículo inválido");
        }
        if (!(tipo.equalsIgnoreCase("carro")
                || tipo.equalsIgnoreCase("caminhão")
                || tipo.equalsIgnoreCase("moto")
                || tipo.equalsIgnoreCase("camionete"))) {
            throw new IllegalArgumentException("Tipo de veiculo inválido");
        }
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca inválida");
        }
        this.marca = marca;
    }

    public abstract double getPrecoBase();

    public abstract int getHorasAlugadas();

    public void setAnoFabricacao(Year anoFabricacao) {
        if (anoFabricacao == null) {
            throw new IllegalArgumentException("O ano do veículo não pode ser nulo.");
        }

        Year anoMinimo = Year.of(2010);
        Year anoMaximo = Year.now().plusYears(1);

        if (anoFabricacao.isBefore(anoMinimo) || anoFabricacao.isAfter(anoMaximo)) {
            throw new IllegalArgumentException("Ano inválido. O veículo deve ser entre " + anoMinimo + " e " + anoMaximo + ".");
        }

        this.anoFabricacao = anoFabricacao;
    }

    public Year getAnoFabricacao() {
        return anoFabricacao;
    }
}
