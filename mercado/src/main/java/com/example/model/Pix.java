package com.example.model;

public class Pix implements Pagamento {
    String msgRetorno;
    String chavePix;
    String nomeTitular;

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
