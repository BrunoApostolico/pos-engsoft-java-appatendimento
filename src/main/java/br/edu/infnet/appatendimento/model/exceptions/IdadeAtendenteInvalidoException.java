package br.edu.infnet.appatendimento.model.exceptions;

public class IdadeAtendenteInvalidoException extends Exception{
    private static final long serialVersionUID = 1L;

    public IdadeAtendenteInvalidoException(String mensagem) {
        super(mensagem);
    }
}
