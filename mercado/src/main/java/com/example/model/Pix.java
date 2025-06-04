package com.example.model;

public class Pix implements Pagamento {
    String msgRetorno;
    String chavePix;
    String nomeTitular;

    @Override
    public String processaPagamento(double valor){
        return msgRetorno = "Iniciando pagamento de: R$ " + valor + " no PIX!";
    }
}
