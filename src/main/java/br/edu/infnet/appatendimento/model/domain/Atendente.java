package br.edu.infnet.appatendimento.model.domain;

public class Atendente extends Pessoa{
    private int idade;
    private String formacao;
    private String turno;

    @Override
    public String toString() {

        return idade + ";" + formacao + ";" + turno + ";" + super.toString();
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
