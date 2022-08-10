package br.edu.infnet.appatendimento.model.test;

import br.edu.infnet.appatendimento.model.domain.Pessoa;

public class AppPessoa {
    private String mensagem;

    public AppPessoa(String mensagem) {
        this.mensagem = mensagem;
    }

    public void relatorio(Pessoa pessoa) {
        System.out.println(mensagem);

        pessoa.impressao();
    }
}
