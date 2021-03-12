package br.com.zup.DesafioM4.service;

/**
 * Classe criada para definir o cadastro de um produto e retorno do mesmo.
 */

import br.com.zup.DesafioM4.DTOs.ProdutoDTO;
import br.com.zup.DesafioM4.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private static List<Produto> produtos = new ArrayList<>();

    @Autowired
    private ClienteService clienteService;

    public Produto cadastrarProduto(Produto produto) {
        produtos.add(produto);
        return produto;
    }

    public List<Produto> pegarProdutos() {
        return produtos;
    }

    public List<Produto> pesquisarProduto(List<ProdutoDTO> produtoDTO) {
        List<Produto> produtoDeCompra = new ArrayList<>();
        for (ProdutoDTO produto : produtoDTO){
            for (Produto produto1 : produtos){
                if (produto.getNome().equalsIgnoreCase(produto1.getNome())){
                    produtoDeCompra.add(produto1);
                }
            }
        }
        return produtoDeCompra;
    }

}