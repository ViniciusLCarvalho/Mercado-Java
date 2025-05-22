package com.example.model;

public class Pessoa {
    private String nomePessoa;
    private Perfil perfil;;


    public Pessoa(){
        this.perfil = Perfil.Default;
    }


    public String getNomePessoa() {
        return nomePessoa;
    }


    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }


    public Perfil getPerfil() {
        return perfil;
    }


    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    
}
