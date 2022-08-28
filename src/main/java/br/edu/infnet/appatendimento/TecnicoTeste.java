package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.TecnicoController;
import br.edu.infnet.appatendimento.model.domain.Tecnico;
import br.edu.infnet.appatendimento.model.exceptions.AlturaMenorException;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class TecnicoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n####Tecnico");

        try {
            Tecnico t1 = new Tecnico();
            t1.setNome("Priscila");
            t1.setEmail("priscila@tecnica.com");
            t1.setTelefone("21993638628");
            t1.setCoren("123123123");
            t1.setDiarista(true);
            t1.setSexo("Feminino");
            t1.setAltura(1.51f);
            System.out.println("Altura maxima: " + t1.validaPessoa());
            TecnicoController.incluir(t1);
        } catch (AlturaMenorException e) {
            System.out.printf("[ERROR - TECNICO] " + e.getMessage());
        }

        try {
            Tecnico t2 = new Tecnico();
            t2.setNome("Vanessa");
            t2.setEmail("vanessa@tecnica.com");
            t2.setTelefone("21991122443");
            t2.setCoren("123432321");
            t2.setDiarista(true);
            t2.setSexo("Feminino");
            t2.setAltura(1.61f);
            System.out.println("Altura maxima: " + t2.validaPessoa());
            TecnicoController.incluir(t2);
        } catch (AlturaMenorException e) {
            System.out.println("[ERROR - TECNICO" + e.getMessage());
        }

        try {
            Tecnico t3 = new Tecnico();
            t3.setNome("Leandro");
            t3.setEmail("leandro@tecnica.com");
            t3.setTelefone("21991188554");
            t3.setCoren("432432432");
            t3.setDiarista(false);
            t3.setSexo("Masculino");
            t3.setAltura(1.71f);
            System.out.println("Altura maxima: " + t3.validaPessoa());
            TecnicoController.incluir(t3);
        } catch (AlturaMenorException e) {
            System.out.println("[ERROR - TECNICO" + e.getMessage());
        }
        try {
            Tecnico t4 = new Tecnico();
            t4.setNome("Eloah");
            t4.setEmail("eloah@tecnica.com");
            t4.setTelefone("21991188554");
            t4.setCoren("432432432");
            t4.setDiarista(false);
            t4.setSexo("Feminino");
            t4.setAltura(1.31f);
            System.out.println("Altura maxima: " + t4.validaPessoa());
            TecnicoController.incluir(t4);
        } catch (AlturaMenorException e) {
            System.out.println("[ERROR - TECNICO" + e.getMessage());
        }
        try {
            Tecnico t5 = new Tecnico();
            t5.setNome("Kelly");
            t5.setEmail("kelly@tecnica.com");
            t5.setTelefone("21991188554");
            t5.setCoren("432432432");
            t5.setDiarista(false);
            t5.setSexo("Feminino");
            t5.setAltura(1.49f);
            System.out.println("Altura maxima: " + t5.validaPessoa());
            TecnicoController.incluir(t5);
        } catch (AlturaMenorException e) {
            System.out.println("[ERROR - TECNICO" + e.getMessage());
        }
    }
}
