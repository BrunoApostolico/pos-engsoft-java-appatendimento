package br.edu.infnet.appatendimento.model.domain;

import br.edu.infnet.appatendimento.model.exceptions.FaltaExperienciaException;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TMedico")
public class Medico extends Pessoa{
    private String crm;
    private boolean especialista;
    private boolean pediatra;
    private Integer anoFormacao;

    @Override
    public void impressao() {
        System.out.println("#medico");
        System.out.println(this);
    }

    @Override
    public String validaPessoa() throws FaltaExperienciaException {
        Integer anoAtual = 2022;

        if(anoFormacao >= 2020){
            throw new FaltaExperienciaException("Impossível preencher o ano de Formação ("+anoFormacao+") com valor maior ou igual a 2020");
        }

        Integer qtsAnosFormacao = anoAtual - anoFormacao;
        return getEmail();
    }

    @Override
    public String toString() {
        return crm + "; " + especialista + "; " + pediatra + "; " + super.toString();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public boolean isEspecialista() {
        return especialista;
    }

    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }

    public boolean isPediatra() {
        return pediatra;
    }

    public void setPediatra(boolean pediatra) {
        this.pediatra = pediatra;
    }
    public Integer getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(Integer anoFormacao) {
        this.anoFormacao = anoFormacao;
    }
}
