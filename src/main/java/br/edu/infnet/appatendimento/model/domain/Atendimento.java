package br.edu.infnet.appatendimento.model.domain;

import br.edu.infnet.appatendimento.interfaces.IPrinter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Atendimento implements IPrinter {
    private LocalDate data;
    private LocalTime hora;
    private String local;
    private Paciente paciente;
    private Set<Pessoa> pessoas;

    public Atendimento (Paciente paciente){
        this.data = LocalDate.now();
        this.hora = LocalTime.now();

        this.paciente = paciente;
    }

    @Override
    public void impressao() {
        System.out.println("#atendimento");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return data + ";" + hora + ";" + local + ";" + paciente + ";" + pessoas.size();
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }


    public Set<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Set<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

}
