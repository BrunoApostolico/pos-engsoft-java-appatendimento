package br.edu.infnet.appatendimento.model.domain;

import br.edu.infnet.appatendimento.interfaces.IPrinter;
import br.edu.infnet.appatendimento.model.exceptions.AlturaMenorException;
import br.edu.infnet.appatendimento.model.exceptions.FaltaExperienciaException;
import br.edu.infnet.appatendimento.model.exceptions.IdadeAtendenteInvalidoException;

import java.util.Objects;

public abstract class Pessoa implements IPrinter {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;

    public abstract String validaPessoa() throws IdadeAtendenteInvalidoException, FaltaExperienciaException, AlturaMenorException;

    @Override
    public String toString() {
        return nome + "; " + email + "; " + telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
//        if (getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
