package br.edu.infnet.appatendimento.model.domain;

import br.edu.infnet.appatendimento.model.exceptions.AlturaMenorException;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TTecnico")
public class Tecnico extends Pessoa{
    private String coren;
    private boolean diarista;
    private String sexo;
    private float altura;

    @Override
    public void impressao() {
        System.out.println("#tecnico");
        System.out.println(this);
    }

    @Override
    public String validaPessoa() throws AlturaMenorException {

        if(altura < 1.5){
            throw new AlturaMenorException("Impossível preencher a altura ("+ altura +") com valor menor que 1,50mt.");
        }

        double adicional = diarista ? 1.1 : 1.3;
        String addSexo = sexo + " Hetero";

        return getEmail() + "; " + adicional + "; " + addSexo;
    }

    @Override
    public String toString() {
        return coren + "; " + diarista + "; " + sexo + "; " + super.toString();
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
