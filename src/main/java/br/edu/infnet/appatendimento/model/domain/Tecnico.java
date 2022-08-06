package br.edu.infnet.appatendimento.model.domain;

public class Tecnico extends Pessoa{
    private String coren;
    private boolean diarista;
    private String sexo;

    @Override
    public String toString() {

        return coren + ";" + diarista + ";" + sexo + ";" + super.toString();
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public boolean isDiarista() {
        return diarista;
    }

    public void setDiarista(boolean diarista) {
        this.diarista = diarista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
