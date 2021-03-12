package br.com.zup.DesafioM4.controller;

/**
 * Classe onde é feito o JSON para a compra de um produto.
 */

import br.com.zup.DesafioM4.DTOs.ComprasDTO;
import br.com.zup.DesafioM4.models.Cliente;
import br.com.zup.DesafioM4.models.Compra;
import br.com.zup.DesafioM4.models.Produto;
import br.com.zup.DesafioM4.service.ClienteService;
import br.com.zup.DesafioM4.service.CompraService;
import br.com.zup.DesafioM4.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("compras/")
public class ComprasController {

    @Autowired
    private CompraService compraService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ComprasDTO efetuarCompra(@RequestBody ComprasDTO compra) {
        Cliente cliente = clienteService.pesquisarClientePeloCPF(compra.getCpf());
        List<Produto> produto = produtoService.pesquisarProduto(compra.getProdutos());
        Compra objetoCompra = compraService.cadastrarCompra(compra.retornoCompra(cliente, produto));
        return compra;
    }

    @GetMapping
    public List<Compra> listarCompras(){
        return listarCompras();
    }

    @GetMapping("{cpf}/")
    public Compra pesquisarCompra(@PathVariable Compra compra){
        try{
            Cliente cliente = compra.getCliente();
            return compra;
        }catch (RuntimeException error){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, error.getMessage());
        }
    }

}