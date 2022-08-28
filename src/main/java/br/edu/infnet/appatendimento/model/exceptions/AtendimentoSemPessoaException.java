package br.edu.infnet.appatendimento.model.exceptions;

public class AtendimentoSemPessoaException extends Exception{
    private static final long serialVersionUID = 1L;

    public AtendimentoSemPessoaException(String mensagem) {
        super(mensagem);
    }
}
