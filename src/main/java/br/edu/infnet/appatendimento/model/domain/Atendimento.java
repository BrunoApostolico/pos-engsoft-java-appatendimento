package br.edu.infnet.appatendimento.model.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {
    private LocalDate data;
    private LocalTime hora;
    private String local;

    public void impressao() {
        System.out.println("#atendimento");
        System.out.println(this);
    }

    @Override
    public String toString() {

        return data + ";" + hora + ";" + local;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
