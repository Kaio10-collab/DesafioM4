package br.com.zup.DesafioM4.controller;

/**
 * Classe onde é feito o JSON do Cliente.
 */

import br.com.zup.DesafioM4.models.Cliente;
import br.com.zup.DesafioM4.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("clientes/")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastroCliente(@RequestBody Cliente cliente){
        Cliente objetoCliente = clienteService.cadastrarCliente(cliente);
        return objetoCliente;
    }

    @GetMapping("{cpf}/")
    public Cliente pesquisarCliente(@PathVariable String cpf){
        try{
            Cliente cliente = clienteService.pesquisarClientePeloCPF(cpf);
            return cliente;
        }catch (RuntimeException error){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, error.getMessage());
        }
    }

}