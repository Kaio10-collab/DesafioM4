package br.com.zup.DesafioM4.controller;

/**
 * Classe onde é feito o JSON do Produto.
 */

import br.com.zup.DesafioM4.models.Produto;
import br.com.zup.DesafioM4.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("produtos/")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto cadastroProduto(@RequestBody Produto produto){
        Produto objetoProduto = produtoService.cadastrarProduto(produto);
        return objetoProduto;
    }

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.pegarProdutos();
    }

}