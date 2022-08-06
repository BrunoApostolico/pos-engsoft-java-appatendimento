package br.edu.infnet.appatendimento.model.domain;

public class Medico {
    public String crm;
    public boolean especialista;
    public boolean pediatra;

    @Override
    public String toString() {
        return crm + ";" + especialista + ";" + pediatra;
    }
}
