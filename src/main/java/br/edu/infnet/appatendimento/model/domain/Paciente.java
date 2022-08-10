package br.edu.infnet.appatendimento.model.domain;


public class Paciente {
    private String nome;
    private String telefone;
    private int idade;

    public Paciente(String nome, String telefone, int idade){
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public void impressao() {
        System.out.println("#paciente");
        System.out.println(this);
    }

    @Override
    public String toString() {

        return nome + ";" + telefone + ";" + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
