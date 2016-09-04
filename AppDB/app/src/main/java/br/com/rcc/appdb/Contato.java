package br.com.rcc.appdb;

/**
 * Created by Rafael Carvalho on 04/09/2016.
 */
public class Contato {


    private String nome;
    private String endereco;
    private String empresa;


    Contato(String nome, String endereco, String empresa) {

        this.setNome(nome);
        this.setEndereco(endereco);
        this.setEmpresa(empresa);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


}
