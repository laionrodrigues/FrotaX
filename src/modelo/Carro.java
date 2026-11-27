package modelo;

public class Carro extends Veiculo {
    private int horasAlugadas;

    public Carro(String placa,String tipo, String marca, String modelo, int anoFabricacao, int horasAlugadas) {
        super(placa, tipo, modelo, marca, anoFabricacao, 50);
        setHorasAlugadas(horasAlugadas);
        setDisponivel(false);

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
