package br.edu.infnet.appatendimento.model.domain;

import br.edu.infnet.appatendimento.model.exceptions.IdadeAtendenteInvalidoException;

public class Atendente extends Pessoa{
    private int idade;
    private String formacao;
    private String turno;

    @Override
    public void impressao() {
        System.out.println("#atendente");
        System.out.println(this);
    }

    @Override
    public String validaPessoa() throws IdadeAtendenteInvalidoException {

        if (idade < 18) {
            throw new IdadeAtendenteInvalidoException("Impossível preencher a idade ("+ idade +") porque o valor é menor do que 18");
        }
        int maxIdade = idade + 10;
        String statusFormacao = formacao + " completo";

        return "idade max: " + maxIdade +"; "+ statusFormacao;
    }

    @Override
    public String toString() {
        return idade + "; " + formacao + "; " + turno + "; " + super.toString();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
