package br.com.zup.DesafioM4.service;
/**
 * Classe criada para definir o cadastro do cliente e retorno de pesquisa pelo cpf.
 */

import br.com.zup.DesafioM4.Exceptions.ClienteNaoEncontradoException;
import br.com.zup.DesafioM4.models.Cliente;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
        return cliente;
    }

    public Cliente pesquisarClientePeloCPF(String cpf){
        for (Cliente cliente : clientes){
            if (cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        throw new ClienteNaoEncontradoException("O cpf digitado não se encontra no banco de dado.");
    }

}