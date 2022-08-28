package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.MedicoController;
import br.edu.infnet.appatendimento.model.domain.Medico;
import br.edu.infnet.appatendimento.model.exceptions.FaltaExperienciaException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class MedicoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n####Medico");

        try {
            Medico med1 = new Medico();
            med1.setNome("Luiz");
            med1.setEmail("luiz@medico.com");
            med1.setTelefone("21 99225-4433");
            med1.setCrm("123123123");
            med1.setEspecialista(true);
            med1.setPediatra(false);
            med1.setAnoFormacao(1970);
            System.out.println("Verifica tempo de formação: " + med1.validaPessoa());
            MedicoController.incluir(med1);
        } catch (FaltaExperienciaException e) {
            System.out.println("[ERROR - MEDICO] "+ e.getMessage());
        }

        try {
            Medico med2 = new Medico();
            med2.setNome("Regina");
            med2.setEmail("regina@medico.com");
            med2.setTelefone("21 99335-8822");
            med2.setCrm("432124223");
            med2.setEspecialista(false);
            med2.setPediatra(false);
            med2.setAnoFormacao(1975);
            System.out.println("Verifica tempo de formação: " + med2.validaPessoa());
            MedicoController.incluir(med2);
        } catch (FaltaExperienciaException e) {
            System.out.println("[ERROR - MEDICO] "+ e.getMessage());
        }

        try {
            Medico med3 = new Medico();
            med3.setNome("Maria Jose");
            med3.setEmail("maria@medico.com");
            med3.setTelefone("21 99113-3775");
            med3.setCrm("643543623");
            med3.setEspecialista(true);
            med3.setPediatra(true);
            med3.setAnoFormacao(1980);
            System.out.println("Verifica tempo de formação: " + med3.validaPessoa());
            MedicoController.incluir(med3);
        } catch (FaltaExperienciaException e) {
            System.out.println("[ERROR - MEDICO] "+ e.getMessage());
        }

        try {
            Medico med4 = new Medico();
            med4.setNome("Fellipe");
            med4.setEmail("fellipe@medico.com");
            med4.setTelefone("21 99113-3775");
            med4.setCrm("643543623");
            med4.setEspecialista(true);
            med4.setPediatra(true);
            med4.setAnoFormacao(2020);
            System.out.println("Verifica tempo de formação: " + med4.validaPessoa());
            MedicoController.incluir(med4);
        } catch (FaltaExperienciaException e) {
            System.out.println("[ERROR - MEDICO] "+ e.getMessage());
        }

        try {
            Medico med5 = new Medico();
            med5.setNome("Gabriel");
            med5.setEmail("gabriel@medico.com");
            med5.setTelefone("21 99113-3775");
            med5.setCrm("643543623");
            med5.setEspecialista(true);
            med5.setPediatra(true);
            med5.setAnoFormacao(2021);
            System.out.println("Verifica tempo de formação: " + med5.validaPessoa());
            MedicoController.incluir(med5);
        } catch (FaltaExperienciaException e) {
            System.out.println("[ERROR - MEDICO] "+ e.getMessage());
        }
    }
}
