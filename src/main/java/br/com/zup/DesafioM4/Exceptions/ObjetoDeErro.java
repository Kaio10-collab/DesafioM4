package br.com.zup.DesafioM4.Exceptions;

public class ObjetoDeErro {

    private String Erro;
    private String campo;

    public ObjetoDeErro(String erro, String campo) {
        Erro = erro;
        this.campo = campo;
    }

    public String getErro() {
        return Erro;
    }

    public void setErro(String erro) {
        Erro = erro;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

}