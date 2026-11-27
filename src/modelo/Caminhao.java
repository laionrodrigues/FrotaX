package modelo;

import java.math.BigDecimal;
import java.time.Year;

public class Caminhao extends Veiculo {
    private int horasAlugadas;

    public Caminhao(String placa,String tipo, String marca, String modelo, int anoFabricacao, int horasAlugadas) {
        super(placa, tipo, marca, modelo, anoFabricacao, new BigDecimal("350"));
        setHorasAlugadas(horasAlugadas);
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
