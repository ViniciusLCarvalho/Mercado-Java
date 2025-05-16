package com.example.bean;

import java.util.ArrayList;
import java.util.List;

import com.example.model.ClientePessoaFisica;
import com.example.model.ClientePessoaJuridica;

public class ClienteBean {
    private List<ClientePessoaFisica> listaClientePFisica;
    private List<ClientePessoaJuridica> listaClientePJuridica;
    private ClientePessoaFisica pessoaFisica;
    private ClientePessoaJuridica pessoaJuridica;

    public ClienteBean() {
        listaClientePFisica = new ArrayList<>();
        listaClientePJuridica = new ArrayList<>();
        pessoaFisica = new ClientePessoaFisica();
        pessoaJuridica = new ClientePessoaJuridica();
    }

    public List<ClientePessoaFisica> getListaClientePFisica() {
        return listaClientePFisica;
    }

    public void setListaClientePFisica(List<ClientePessoaFisica> listaClientePFisica) {
        this.listaClientePFisica = listaClientePFisica;
    }

    public List<ClientePessoaJuridica> getListaClientePJuridica() {
        return listaClientePJuridica;
    }

    public void setListaClientePJuridica(List<ClientePessoaJuridica> listaClientePJuridica) {
        this.listaClientePJuridica = listaClientePJuridica;
    }

    public ClientePessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(ClientePessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public ClientePessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(ClientePessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public void adicionaClientePessoaFisica(){
        listaClientePFisica.add(pessoaFisica);
        pessoaFisica = new ClientePessoaFisica();
    }
    public void adicionaClientePessoaJuridica(){
        listaClientePJuridica.add(pessoaJuridica);
        pessoaJuridica = new ClientePessoaJuridica();
    }

}
