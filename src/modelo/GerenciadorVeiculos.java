package modelo;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorVeiculos {
    private final List<Veiculo> frota = new ArrayList();
    private int proximoId = 1;
    private double precoFinal;

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculo.setId(proximoId++);
        frota.add(veiculo);
    }

    public double calcularAluguel(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo inexistente.");
        }

        int anoAtual = Year.now().plusYears(1).getValue();
        int anoFabricacao = veiculo.getAnoFabricacao().getValue();

        int horasAlugadas = veiculo.getHorasAlugadas();
        double precoBase = veiculo.getPrecoBase();

        int anosDeUso = Math.max(0, anoAtual - anoFabricacao);

        if (anosDeUso == 0) {
            precoFinal = precoBase * horasAlugadas;
            return precoFinal;
        } else {
            double desconto = precoBase * (anosDeUso / 100.0);
            double valorComDesconto = precoBase - desconto;
            precoFinal = valorComDesconto * horasAlugadas;
            return precoFinal;
        }
    }
}
