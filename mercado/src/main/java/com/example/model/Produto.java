package com.example.model;

public class Produto {
    private int codigoProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private float precoProduto;
    private Categoria categoria;

    public Produto() {
        categoria = new Categoria();
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
