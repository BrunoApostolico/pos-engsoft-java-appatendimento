package br.edu.infnet.appatendimento.model.exceptions;

public class NomeInvalidoException extends Exception{
    private static final long serialVersionUID = 1L;

    public NomeInvalidoException(String mensagem) {
        super(mensagem);
    }
}
