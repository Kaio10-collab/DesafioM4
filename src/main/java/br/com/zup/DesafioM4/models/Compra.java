package br.com.zup.DesafioM4.models;

/**
 * Classe modelo Compra para repassar os atributos.
 */

import java.util.List;

public class Compra {

    private Cliente cliente;
    private List<Produto> produto;

    public Compra() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

}