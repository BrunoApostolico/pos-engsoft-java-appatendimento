package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Tecnico;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TecnicoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Tecnico");

        Tecnico t1 = new Tecnico();
        t1.coren = "123123123";
        t1.diarista = true;
        t1.sexo = "Feminino";

        System.out.println(t1);

        Tecnico t2 = new Tecnico();
        t2.coren = "123432321";
        t2.diarista = true;
        t2.sexo = "Masculino";

        System.out.println(t2);

        Tecnico t3 = new Tecnico();
        t3.coren = "432432432";
        t3.diarista = false;
        t3.sexo = "Feminino";

        System.out.println(t3);
    }
}
