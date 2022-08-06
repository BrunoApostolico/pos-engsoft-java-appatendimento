package br.edu.infnet.appatendimento.model.domain;

public class Atendente {
    public int idade;
    public String formacao;
    public String turno;

    @Override
    public String toString() {
        return idade + ";" + formacao + ";" + turno;
    }
}
