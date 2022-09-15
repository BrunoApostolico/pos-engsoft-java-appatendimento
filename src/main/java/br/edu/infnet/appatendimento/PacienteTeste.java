package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.PacienteController;
import br.edu.infnet.appatendimento.model.domain.Paciente;
import br.edu.infnet.appatendimento.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appatendimento.model.service.PacienteService;
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
@Order(2)
public class PacienteTeste implements ApplicationRunner {

    @Autowired
    private PacienteService pacienteService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n####Paciente");

        //-------------------------
        String dir = "c:/Dev/pos-live/appatendimento/src/main/resources/";
        String arq = "pacientes.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){
                    String[] campos = linha.split(";");
                    try {
                        Paciente p1 = new Paciente(campos[0], campos[1], Integer.parseInt(campos[2]));
                        pacienteService.incluir(p1);
                    } catch (NomeInvalidoException e) {
                        System.out.println("[ERROR] - PACIENTE" + e.getMessage());
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
