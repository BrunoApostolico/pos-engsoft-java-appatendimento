package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AtendenteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Atendente");

        Atendente at1 = new Atendente();
        at1.idade = 20;
        at1.formacao = "Ensino Médio";
        at1.turno = "Dia";

        System.out.println(at1);

        Atendente at2 = new Atendente();
        at2.idade = 30;
        at2.formacao = "Ensino Superior";
        at2.turno = "Noite";

        System.out.println(at2);

        Atendente at3 = new Atendente();
        at3.idade = 18;
        at3.formacao = "Ensino Fundamental";
        at3.turno = "Dia";

        System.out.println(at3);
    }
}
