package service;

import modelo.Veiculo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorVeiculos {
    private final List<Veiculo> frota = new ArrayList();
    private int proximoId = 1;
    private BigDecimal precoFinal;

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo inexistente.");
        }
        veiculo.setId(proximoId++);
        frota.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo inexistente.");
        }
        frota.remove(veiculo);
    }

    public BigDecimal calcularAluguel(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo inexistente.");
        }

        int anoAtual = Year.now().plusYears(1).getValue();
        int anoFabricacao = veiculo.getAnoFabricacao();

        BigDecimal horasAlugadas = BigDecimal.valueOf(veiculo.getHorasAlugadas());
        BigDecimal precoBase = veiculo.getPrecoBase();

        int anosDeUso = Math.max(0, anoAtual - anoFabricacao);

        if (anosDeUso == 0) {
            precoFinal = precoBase.multiply(horasAlugadas).setScale(2, RoundingMode.HALF_EVEN);
            return precoFinal;
        } else {
            BigDecimal percentualAnosDeUso = BigDecimal.valueOf(anosDeUso).divide(BigDecimal.valueOf(100),4, RoundingMode.HALF_EVEN);
            BigDecimal desconto = precoBase.multiply(percentualAnosDeUso);
            BigDecimal valorComDesconto = precoBase.subtract(desconto);
            precoFinal = valorComDesconto.multiply(horasAlugadas).setScale(2, RoundingMode.HALF_EVEN);
            return precoFinal;
        }
    }
    
    public List<Veiculo> listarVeiculos() {
        return Collections.unmodifiableList(frota);
    }
}
