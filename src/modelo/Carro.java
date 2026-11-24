package modelo;

import java.time.Year;

public class Carro extends Veiculo {
    private double precoBase = 150;
    private int horasAlugadas;


    public Carro(String placa, String tipo, String modelo, String marca, int anoFabricacao) {
        super(placa, tipo, modelo, marca, Year.of(anoFabricacao));
    }

    @Override
    public double getPrecoBase() {
        return precoBase;
    }

    @Override
    public int getHorasAlugadas() {
        return horasAlugadas;
    }
}
