package br.edu.infnet.appatendimento.model.domain;


import br.edu.infnet.appatendimento.interfaces.IPrinter;

public class Usuario implements IPrinter {
    private String nome;
    private String email;
    private String senha;


    @Override
    public void impressao() {
        System.out.println("#usuario");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return nome + ";" + email + ";" + senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}