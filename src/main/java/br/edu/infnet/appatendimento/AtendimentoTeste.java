package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Atendimento;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
@Order(1)
public class AtendimentoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Atendimento");

        Atendimento atd1 = new Atendimento(); // instanciar a classe Atendimento, criando espaço na memoria para armazenar o obj
        atd1.setData(LocalDate.now());
        atd1.setHora(LocalTime.now());
        atd1.setLocal("Local 1");

        System.out.println (atd1);

        Atendimento atd2 = new Atendimento();
        atd2.setData(LocalDate.now());
        atd2.setHora(LocalTime.now());
        atd2.setLocal("Local 2");

        System.out.println (atd2);

        Atendimento atd3 = new Atendimento();
        atd3.setData(LocalDate.now());
        atd3.setHora(LocalTime.now());
        atd3.setLocal("Local 3");

        System.out.println (atd3);

    }
}
