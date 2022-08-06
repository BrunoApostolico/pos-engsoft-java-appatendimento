package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PacienteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Paciente");

        Paciente p1 = new Paciente();
        p1.nome = "Bruno";
        p1.idade = 36;
        p1.telefone = "993703273";

        System.out.println(p1);

        Paciente p2 = new Paciente();
        p2.nome = "Priscila";
        p2.idade = 36;
        p2.telefone = "993638628";

        System.out.println(p2);

        Paciente p3 = new Paciente();
        p3.nome = "Eloah";
        p3.idade = 6;
        p3.telefone = "999999999";

        System.out.println(p3);
    }
}
