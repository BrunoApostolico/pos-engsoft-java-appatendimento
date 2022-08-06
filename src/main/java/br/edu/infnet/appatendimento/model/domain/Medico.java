package br.edu.infnet.appatendimento.model.domain;

public class Medico extends Pessoa{
    private String crm;
    private boolean especialista;
    private boolean pediatra;

    @Override
    public String toString() {

        return crm + ";" + especialista + ";" + pediatra + ";" + super.toString();
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
}
