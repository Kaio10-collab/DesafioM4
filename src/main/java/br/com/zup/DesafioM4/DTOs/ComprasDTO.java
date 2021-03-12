package br.com.zup.DesafioM4.DTOs;

/**
 * Classe DTO para definir os atributos necessários.
 */

import br.com.zup.DesafioM4.models.Cliente;
import br.com.zup.DesafioM4.models.Compra;
import br.com.zup.DesafioM4.models.Produto;

import java.util.List;

public class ComprasDTO {

    private String cpf;
    private List<ProdutoDTO> produtos;

    public ComprasDTO() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }

    public Compra retornoCompra(Cliente cliente, List<Produto> produtos){
        Compra compra = new Compra();
        compra.setProduto(produtos);
        compra.setCliente(cliente);
        return compra;

    }

}