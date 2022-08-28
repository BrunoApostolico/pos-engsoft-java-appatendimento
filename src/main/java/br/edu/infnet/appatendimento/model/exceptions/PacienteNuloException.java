package br.edu.infnet.appatendimento.model.exceptions;

public class PacienteNuloException extends Exception{
    private static final long serialVersionUID = 1L;

    public PacienteNuloException(String mensagem) {
        super(mensagem);
    }
}
