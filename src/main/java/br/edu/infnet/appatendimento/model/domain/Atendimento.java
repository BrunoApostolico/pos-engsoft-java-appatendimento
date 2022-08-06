package br.edu.infnet.appatendimento.model.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {
    public LocalDate data;
    public LocalTime hora;
    public String local;

    @Override
    public String toString() {
        return data + ";" + hora + ";" + local;
    }
}
