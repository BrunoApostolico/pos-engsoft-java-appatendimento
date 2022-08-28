package br.edu.infnet.appatendimento.model.exceptions;

public class FaltaExperienciaException extends Exception{
    private static final long serialVersionUID = 1L;

    public FaltaExperienciaException(String mensagem) {
        super(mensagem);
    }
}
