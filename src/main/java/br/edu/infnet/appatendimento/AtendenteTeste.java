package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.AtendenteController;
import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.exceptions.IdadeAtendenteInvalidoException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class AtendenteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n####Atendente");

        try {
            Atendente at1 = new Atendente();
            at1.setNome("Karen");
            at1.setTelefone("2499885577");
            at1.setEmail("karen@atendimento.com");
            at1.setIdade(19);
            at1.setFormacao("Ensino Médio");
            at1.setTurno("Dia");
            System.out.println("Validar Atendente: " + at1.validaPessoa());
            AtendenteController.incluir(at1);
        } catch (IdadeAtendenteInvalidoException e) {
            System.out.println("[ERROR ATENDENTE] " + e.getMessage());
        }

        try {
            Atendente at2 = new Atendente();
            at2.setNome("Hellen");
            at2.setTelefone("2499778866");
            at2.setEmail("hellen@atendimento.com");
            at2.setIdade(23);
            at2.setFormacao("Ensino Superior");
            at2.setTurno("Noite");
            System.out.println("Validar Atendente: " + at2.validaPessoa());
            AtendenteController.incluir(at2);
        } catch (IdadeAtendenteInvalidoException e) {
            System.out.println("[ERROR ATENDENTE] " + e.getMessage());
        }

        try {
            Atendente at3 = new Atendente();
            at3.setNome("Kaian");
            at3.setTelefone("2499224455");
            at3.setEmail("kaian@atendimento.com");
            at3.setIdade(21);
            at3.setFormacao("Ensino Fundamental");
            at3.setTurno("Dia");
            System.out.println("Validar Atendente: " + at3.validaPessoa());
            AtendenteController.incluir(at3);
        } catch (IdadeAtendenteInvalidoException e) {
            System.out.println("[ERROR ATENDENTE] " + e.getMessage());
        }

        try {
            Atendente at4 = new Atendente();
            at4.setNome("Gabriel");
            at4.setTelefone("2499224455");
            at4.setEmail("gabriel@atendimento.com");
            at4.setIdade(10);
            at4.setFormacao("Ensino Fundamental");
            at4.setTurno("Dia");
            System.out.println("Validar Atendente: " + at4.validaPessoa());
            AtendenteController.incluir(at4);
        } catch (IdadeAtendenteInvalidoException e) {
            System.out.println("[ERROR ATENDENTE] " + e.getMessage());
        }
    }
}
