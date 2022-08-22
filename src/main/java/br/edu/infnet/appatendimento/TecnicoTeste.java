package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.TecnicoController;
import br.edu.infnet.appatendimento.model.domain.Tecnico;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class TecnicoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Tecnico");

        Tecnico t1 = new Tecnico();
        t1.setNome("Priscila");
        t1.setEmail("priscila@tecnica.com");
        t1.setTelefone("21993638628");
        t1.setCoren("123123123");
        t1.setDiarista(true);
        t1.setSexo("Feminino");
        TecnicoController.incluir(t1);

        Tecnico t2 = new Tecnico();
        t2.setNome("Vanessa");
        t2.setEmail("vanessa@tecnica.com");
        t2.setTelefone("21991122443");
        t2.setCoren("123432321");
        t2.setDiarista(true);
        t2.setSexo("Feminino");
        TecnicoController.incluir(t2);

        Tecnico t3 = new Tecnico();
        t3.setNome("Leandro");
        t3.setEmail("leandro@tecnica.com");
        t3.setTelefone("21991188554");
        t3.setCoren("432432432");
        t3.setDiarista(false);
        t3.setSexo("Masculino");
        TecnicoController.incluir(t3);
    }
}
