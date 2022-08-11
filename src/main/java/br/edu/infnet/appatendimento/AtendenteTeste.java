package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.test.AppPessoa;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class AtendenteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Atendente");

        Atendente at1 = new Atendente();
        at1.setNome("Karen");
        at1.setTelefone("2499885577");
        at1.setEmail("karen@atendimento.com");
        at1.setIdade(19);
        at1.setFormacao("Ensino Médio");
        at1.setTurno("Dia");

        new AppPessoa("Inclusão da atendente Karen!!!").relatorio(at1);

        Atendente at2 = new Atendente();
        at2.setNome("Hellen");
        at2.setTelefone("2499778866");
        at2.setEmail("hellen@atendimento.com");
        at2.setIdade(23);
        at2.setFormacao("Ensino Superior");
        at2.setTurno("Noite");

        new AppPessoa("Inclusão da atendente Hellen!!!").relatorio(at2);

        Atendente at3 = new Atendente();
        at3.setNome("Kaian");
        at3.setTelefone("2499224455");
        at3.setEmail("kaian@atendimento.com");
        at3.setIdade(21);
        at3.setFormacao("Ensino Fundamental");
        at3.setTurno("Dia");

        new AppPessoa("Inclusão do atendente Kaian!!!").relatorio(at3);
    }
}
