package br.edu.infnet.appatendimento.model.domain;


public class Paciente {
    public String nome;
    public String telefone;
    public int idade;

    @Override
    public String toString() {
        return nome + ";" + telefone + ";" + idade;
    }
}
