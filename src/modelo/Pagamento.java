package modelo;

import enums.FormaPagamento;
import enums.StatusLocacao;
import enums.StatusPagamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pagamento {
    private int id;
    private StatusPagamento locacao;
    private BigDecimal valor;
    private LocalDateTime dataPagamento;
    private FormaPagamento formaPagamento;
    private StatusPagamento status;

    public int getId() {
        return id;
    }

    public StatusPagamento getLocacao() {
        return locacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void confirmarPagamento() {
        if (status != StatusPagamento.PENDENTE) {
            throw new IllegalStateException("Pagamento não está pendente.");
        }

        this.status = StatusPagamento.PAGO;
        this.dataPagamento = LocalDateTime.now();
    }

    public void cancelarPagamento() {
        if (status != StatusPagamento.PENDENTE) {
            throw new IllegalStateException("Pagamento não pode ser cancelado.");
        }

        this.status = StatusPagamento.CANCELADO;
    }

    public void estornarPagamento() {
        if (status != StatusPagamento.PAGO) {
            throw new IllegalStateException("Pagamento ainda não foi confirmado.");
        }

        this.status = StatusPagamento.ESTORNADO;
    }
}