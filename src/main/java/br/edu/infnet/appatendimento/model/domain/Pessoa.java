package br.edu.infnet.appatendimento.model.domain;

import br.edu.infnet.appatendimento.interfaces.IPrinter;

public abstract class Pessoa implements IPrinter {
    private String nome;
    private String email;
    private String telefone;

    public abstract String validaEmail();

    @Override
    public String toString() {
        return nome + "; " + email + "; " + telefone + "; " + validaEmail();
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
