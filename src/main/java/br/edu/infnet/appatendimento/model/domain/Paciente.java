package br.edu.infnet.appatendimento.model.domain;


import br.edu.infnet.appatendimento.interfaces.IPrinter;
import br.edu.infnet.appatendimento.model.exceptions.NomeInvalidoException;

public class Paciente implements IPrinter {
    private Integer id;
    private String nome;
    private String telefone;
    private int idade;

    public Paciente(String nome, String telefone, int idade) throws NomeInvalidoException {

        if(nome == null) {
            throw new NomeInvalidoException("Não é possível aceitar nome nulo");
        }
        if(nome.isEmpty()) {
            throw new NomeInvalidoException("Não é poss´vel aceitar nome sem preenchimentoPacienteNuloException");
        }

        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }
    @Override
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

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
}
