package com.example.model;

public class ClientePessoaFisica extends Cliente {
    private String cnpjCliente;

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

}