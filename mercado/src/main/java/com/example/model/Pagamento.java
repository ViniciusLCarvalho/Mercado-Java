package com.example.model;

public interface Pagamento {

    public String processaPagamento(double valor);

    public String rollbackPagamento(double valor);
}