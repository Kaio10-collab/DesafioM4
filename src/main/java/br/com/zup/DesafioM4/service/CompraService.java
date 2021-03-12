package br.com.zup.DesafioM4.service;

/**
 * Classe criada para definir o cadastro de uma compra.
 */

import br.com.zup.DesafioM4.models.Compra;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompraService {

    private static List<Compra> compras = new ArrayList<>();

    public Compra cadastrarCompra(Compra compra) {
        compras.add(compra);
        return compra;
    }

}