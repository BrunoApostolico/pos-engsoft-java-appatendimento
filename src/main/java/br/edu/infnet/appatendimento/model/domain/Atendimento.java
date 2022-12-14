package br.edu.infnet.appatendimento.model.domain;

import br.edu.infnet.appatendimento.interfaces.IPrinter;
import br.edu.infnet.appatendimento.model.exceptions.AtendimentoSemPessoaException;
import br.edu.infnet.appatendimento.model.exceptions.PacienteNuloException;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name = "TAtendimento")
public class Atendimento implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate data;
    private LocalTime hora;
    private Boolean presencial;
    private String descricao;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idPaciente")
    private Paciente paciente;
    @ManyToMany(cascade = CascadeType.DETACH)
    private Set<Pessoa> pessoas;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Atendimento() {
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        this.presencial = false;
    }

    public Atendimento(Paciente paciente, Set<Pessoa> pessoas) throws PacienteNuloException, AtendimentoSemPessoaException {
        this();
        if (paciente == null) {
            throw new PacienteNuloException("Impossivel criar um Atendimento sem um paciente!");
        }
//        if(pessoas == null){
//            throw new AtendimentoSemPessoaException("Impossível criar um Atendimento sem uma listagem de pessoas associadas");
//        }
//        if(pessoas.size() < 1){
//            throw new AtendimentoSemPessoaException("Impossível criar um Atendimento sem pessoas");
//        }


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
        return data + ";" + hora + ";" + descricao + ";" + presencial + ";" + paciente + ";" + pessoas.size();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getPresencial() {
        return presencial;
    }

    public void setPresencial(Boolean presencial) {
        this.presencial = presencial;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Set<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Set<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}