package com.example.bean;

import java.util.*;

import com.example.model.Categoria;
import com.example.model.Produto;

public class EstoqueBean {
    private List<Produto> listaProdutos;
    private List<Categoria> listaCategoria;
    private Produto produto;
    private Categoria categoria;

    public EstoqueBean() {
        listaProdutos = new ArrayList<>();
        listaCategoria = new ArrayList<>();
        produto = new Produto();
        categoria = new Categoria();
    }

    public List<Categoria> getListaCategoria() {
        return listaCategoria;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaCategoria(List<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void adicionaProduto(){
        listaProdutos.add(produto);
        produto = new Produto();
    }

    public void adicionarCategoria(){
        listaCategoria.add(categoria);
        categoria = new Categoria();
    }
}