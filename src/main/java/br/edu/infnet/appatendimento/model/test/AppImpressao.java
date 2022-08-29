package br.edu.infnet.appatendimento.model.test;

import br.edu.infnet.appatendimento.interfaces.IPrinter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppImpressao {

    public static void relatorio(String mensagem, IPrinter printer) {
        System.out.println(mensagem);

        printer.impressao();
    }

    public static void main(String[] args) {

        String dir = "c:/Dev/pos-live/appatendimento/src/main/resources";
        String arq = "atendimentos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){
                    System.out.println(linha);

                    linha = leitura.readLine();
                }

                leitura.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!!");
            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
            }
        } finally {
            System.out.println("Terminou!!");
        }
    }
}
