package modelo;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorVeiculos {
    private final List<Veiculo> frota = new ArrayList();
    private int proximoId = 1;
    private double precoFinal;

    public void adicionar(Veiculo veiculo) {
        veiculo.setId(proximoId++);
        frota.add(veiculo);
    }

    public double calcularAluguel(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo não pode ser nulo.");
        }

        int horas = veiculo.getHorasAlugadas();
        double precoBase = veiculo.getPrecoBase();

        int anosDeUso = Year.now().getValue() - veiculo.getAnoFabricacao().getValue();

        double valorFatorAno = Math.max(0.50, 1.0 - (anosDeUso * 0.02));

        double valorHoraAjustado = precoBase * valorFatorAno;
        precoFinal = valorHoraAjustado * horas;
        return precoFinal;
    }
}
