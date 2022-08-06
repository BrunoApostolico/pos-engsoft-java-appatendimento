package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Medico;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MedicoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Medico");

        Medico med1 = new Medico();
        med1.crm = "123123123";
        med1.especialista = true;
        med1.pediatra = false;

        System.out.println(med1);

        Medico med2 = new Medico();
        med2.crm = "432124223";
        med2.especialista = false;
        med2.pediatra = false;

        System.out.println(med2);

        Medico med3 = new Medico();
        med3.crm = "643543623";
        med3.especialista = true;
        med3.pediatra = true;

        System.out.println(med3);
    }
}
