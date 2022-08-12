package br.edu.infnet.appatendimento.model.test;

import br.edu.infnet.appatendimento.interfaces.IPrinter;

public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter printer) {
        System.out.println(mensagem);

        printer.impressao();
    }
}
