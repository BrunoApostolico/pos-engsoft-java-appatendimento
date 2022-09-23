package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.MedicoController;
import br.edu.infnet.appatendimento.model.domain.Medico;
import br.edu.infnet.appatendimento.model.exceptions.FaltaExperienciaException;
import br.edu.infnet.appatendimento.model.service.MedicoService;
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
@Order(4)
public class MedicoTeste implements ApplicationRunner {

    @Autowired
    private MedicoService medicoService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n####Medico");

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

                    if("M".equalsIgnoreCase(campos[0])) {

                        try {
                            Medico med1 = new Medico();
                            med1.setNome(campos[1]);
                            med1.setTelefone(campos[2]);
                            med1.setEmail(campos[3]);
                            med1.setCrm(campos[4]);
                            med1.setEspecialista(Boolean.parseBoolean(campos[5]));
                            med1.setPediatra(Boolean.parseBoolean(campos[6]));
                            med1.setAnoFormacao(Integer.parseInt(campos[7]));
                            System.out.println("Verifica tempo de formação: " + med1.validaPessoa());
                            medicoService.incluir(med1);
                        } catch (FaltaExperienciaException e) {
                            System.out.println("[ERROR - MEDICO] " + e.getMessage());
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
