package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.TecnicoController;
import br.edu.infnet.appatendimento.model.domain.Tecnico;
import br.edu.infnet.appatendimento.model.exceptions.AlturaMenorException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(5)
public class TecnicoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n####Tecnico");

        //-------------------------
        String dir = "c:/Dev/pos-live/appatendimento/src/main/resources/";
        String arq = "tecnicos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){
                    String[] campos = linha.split(";");

                    try {
                        Tecnico t3 = new Tecnico();
                        t3.setNome(campos[0]);
                        t3.setEmail(campos[1]);
                        t3.setTelefone(campos[2]);
                        t3.setCoren(campos[3]);
                        t3.setDiarista(Boolean.parseBoolean(campos[4]));
                        t3.setSexo(campos[5]);
                        t3.setAltura(Float.parseFloat(campos[6]));
                        System.out.println("Altura maxima: " + t3.validaPessoa());
                        TecnicoController.incluir(t3);
                    } catch (AlturaMenorException e) {
                        System.out.println("[ERROR - TECNICO" + e.getMessage());
                    }
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
