package br.com.zup.DesafioM4.models;

/**
 * Classe modelo Cliente para repassar os atributos.
 */

import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.Email;

public class Cliente {

    private String nome;
    @CPF(message = "Cpf não é válido")
    private String cpf;
    @Email(message = "Email não é válido")
    private String email;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}