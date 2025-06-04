package com.example.model;

import java.util.Date;

public class CartaoDeCredito implements Pagamento {
    String msgRetorno;
    String nomeTitular;
    String numeroCartao;
    int numeroCvv;
    Date dataValidade;
    String bandeira;

    @Override
    public String processaPagamento(double valor){
        return msgRetorno = "Iniciando pagamento de :R$ "+ valor + " com o cartão de crédito: " + numeroCartao;
    }
}
