package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
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
        AppImpressao.relatorio("Inclusão do Paciente 1", p1);

        Paciente p2 = new Paciente("Priscila","993638628",36);
        AppImpressao.relatorio("Inclusão do Paciente 2", p2);

        Paciente p3 = new Paciente("Eloah","999998877",6);
        AppImpressao.relatorio("Inclusão do Paciente 3", p3);
    }
}
