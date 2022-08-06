package br.edu.infnet.appatendimento.model.domain;

public class Tecnico {
    public String coren;
    public boolean diarista;
    public String sexo;

    @Override
    public String toString() {
        return coren + ";" + diarista + ";" + sexo;
    }
}
