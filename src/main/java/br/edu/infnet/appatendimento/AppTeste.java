package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.AppController;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.domain.app.Atributo;
import br.edu.infnet.appatendimento.model.domain.app.Classe;
import br.edu.infnet.appatendimento.model.domain.app.Projeto;
import br.edu.infnet.appatendimento.model.service.AppService;
import br.edu.infnet.appatendimento.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class AppTeste implements ApplicationRunner {

    @Autowired
    private AppService appService;

    public void run(ApplicationArguments args) throws Exception {

        //-------------------------
        final String dir = "src/main/resources/";
        String arq = "app.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                Projeto projeto = null;
                List<Classe> classes = null;
                List<Atributo> atributos = null;

                String linha = leitura.readLine();
                while (linha != null){

                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()){
                        case "P":

                            classes = new ArrayList<Classe>();

                            projeto = new Projeto();
                            projeto.setNome(campos[1]);
                            projeto.setDescricao(campos[2]);
                            projeto.setClasses(classes);
                            break;

                        case "C":
                            atributos = new ArrayList<Atributo>();

                            Classe classe = new Classe();
                            classe.setNome(campos[1]);
                            classe.setAtributos(atributos);
                            classes.add(classe);
                            break;

                        case "A":
                            Atributo atributo = new Atributo(campos[1], campos[2], campos[3]);
                            atributos.add(atributo);
                            break;

                        default:
                            System.out.println("Opção Inválida");
                    }

                    linha = leitura.readLine();
                }

                appService.incluir(projeto);

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
