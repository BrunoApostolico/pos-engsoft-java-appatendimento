package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.TecnicoController;
import br.edu.infnet.appatendimento.model.domain.Tecnico;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.exceptions.AlturaMenorException;
import br.edu.infnet.appatendimento.model.service.TecnicoService;
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
@Order(5)
public class TecnicoTeste implements ApplicationRunner {

    @Autowired
    private TecnicoService tecnicoService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n####Tecnico");

        //-------------------------

        Usuario usuario = new Usuario();
        usuario.setId(1);

        final String dir = "src/main/resources/";
        String arq = "tecnicos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null) {
                    String[] campos = linha.split(";");

                    if ("T".equalsIgnoreCase(campos[0])) {
                        try {

                            Tecnico tecnico = new Tecnico();
                            tecnico.setNome(campos[1]);
                            tecnico.setEmail(campos[2]);
                            tecnico.setTelefone(campos[3]);
                            tecnico.setCoren(campos[4]);
                            tecnico.setDiarista(Boolean.parseBoolean(campos[5]));
                            tecnico.setSexo(campos[6]);
                            tecnico.setAltura(Float.parseFloat(campos[7]));
                            tecnico.setUsuario(usuario);
                            System.out.println("Altura maxima: " + tecnico.validaPessoa());
                            tecnicoService.incluir(tecnico);
                        } catch (AlturaMenorException e) {
                            System.out.println("[ERROR - TECNICO" + e.getMessage());
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
