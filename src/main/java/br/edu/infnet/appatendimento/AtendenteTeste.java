package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.AtendenteController;
import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.exceptions.IdadeAtendenteInvalidoException;
import br.edu.infnet.appatendimento.model.service.AtendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(3)
public class AtendenteTeste implements ApplicationRunner {

    @Autowired
    private AtendenteService atendenteService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n####Atendente");

        //-------------------------
        String dir = "c:/Dev/pos-live/appatendimento/src/main/resources/";
        String arq = "pessoas.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){

                    String[] campos = linha.split(";");

                    if("A".equalsIgnoreCase(campos[0])){
                        try {

                            Atendente at1 = new Atendente();
                            at1.setNome(campos[1]);
                            at1.setTelefone(campos[2]);
                            at1.setEmail(campos[3]);
                            at1.setIdade(Integer.parseInt(campos[4]));
                            at1.setFormacao(campos[5]);
                            at1.setTurno(campos[6]);
                            System.out.println("Validar Atendente: " + at1.validaPessoa());
                            atendenteService.incluir(at1);
                        } catch (IdadeAtendenteInvalidoException e) {
                            System.out.println("[ERROR ATENDENTE] " + e.getMessage());
                        }
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
