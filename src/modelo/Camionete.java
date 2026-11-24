package modelo;

import java.time.Year;

public class Camionete extends Veiculo {
    private double precoBase = 200;
    private int horasAlugadas;

    public Camionete(String placa, String tipo, String modelo, String marca, int anoFabricacao, int horasAlugadas) {
        super(placa, tipo, modelo, marca, Year.of(anoFabricacao));
        setHorasAlugadas(horasAlugadas);
        setDisponivel(false);
    }

    @Override
    public double getPrecoBase() {
        return precoBase;
    }

    @Override
    public int getHorasAlugadas() {
        return horasAlugadas;
    }

    public void setHorasAlugadas(int horasAlugadas) {
        if (horasAlugadas <= 0 ) {
            throw new IllegalArgumentException("Horas inválidas.");
        }
        if (horasAlugadas < 6) {
            throw new IllegalArgumentException("Horas inválidas, deve ser maior que 5 horas.");
        }
        this.horasAlugadas = horasAlugadas;
    }
}