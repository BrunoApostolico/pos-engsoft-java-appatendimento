package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class PacienteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Paciente");

        Paciente p1 = new Paciente("Bruno","993703274",36);
        System.out.println(p1);

        Paciente p2 = new Paciente("Priscila","993638628",36);
        System.out.println(p2);

        Paciente p3 = new Paciente("Eloah","999998877",6);
        System.out.println(p3);
    }
}
