package br.edu.infnet.appatendimento.model.domain;

import br.edu.infnet.appatendimento.interfaces.IPrinter;
import br.edu.infnet.appatendimento.model.exceptions.AtendimentoSemPessoaException;
import br.edu.infnet.appatendimento.model.exceptions.PacienteNuloException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Atendimento implements IPrinter {
    private LocalDate data;
    private LocalTime hora;
    private String local;
    private Paciente paciente;
    private Set<Pessoa> pessoas;

    public Atendimento (Paciente paciente, Set<Pessoa> pessoas) throws PacienteNuloException, AtendimentoSemPessoaException {

        if(paciente == null){
            throw new PacienteNuloException("Impossivel criar um Atendimento sem um paciente!");
        }
        if(pessoas == null){
            throw new AtendimentoSemPessoaException("Impossível criar um Atendimento sem uma listagem de pessoas associadas");
        }
        if(pessoas.size() < 1){
            throw new AtendimentoSemPessoaException("Impossível criar um Atendimento sem pessoas");
        }

        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        this.paciente = paciente;
        this.pessoas = pessoas;
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

}
