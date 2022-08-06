package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Atendimento;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class AtendimentoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Atendimento");

        Atendimento atd1 = new Atendimento(); // instanciar a classe Atendimento, criando espaço na memoria para armazenar o obj
        atd1.data = LocalDate.now();
        atd1.hora = LocalTime.now();
        atd1.local = "Local 1";

        System.out.println (atd1);

        Atendimento atd2 = new Atendimento();
        atd2.data = LocalDate.now();
        atd2.hora = LocalTime.now();
        atd2.local = "Local 2";

        System.out.println (atd2);

        Atendimento atd3 = new Atendimento();
        atd3.data = LocalDate.now();
        atd3.hora = LocalTime.now();
        atd3.local = "Local 3";

        System.out.println (atd3);

    }
}
