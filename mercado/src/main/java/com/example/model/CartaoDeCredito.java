package com.example.model;

import java.util.Date;

public class CartaoDeCredito implements Pagamento {
    String msgRetorno;
    String nomeTitular;
    String numeroCartao;
    int numeroCvv;
    Date dataValidade;
    String bandeira;
    int numeroPagamento;

    @Override
    public String processaPagamento(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processaPagamento'");
    }
    @Override
    public String rollbackPagamento(double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rollbackPagamento'");
    }

    
}
