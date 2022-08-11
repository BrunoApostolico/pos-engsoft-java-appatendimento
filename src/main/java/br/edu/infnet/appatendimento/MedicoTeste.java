package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.Medico;
import br.edu.infnet.appatendimento.model.test.AppPessoa;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class MedicoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Medico");

        Medico med1 = new Medico();
        med1.setNome("Luiz");
        med1.setEmail("luiz@medico.com");
        med1.setTelefone("219922554433");
        med1.setCrm("123123123");
        med1.setEspecialista(true);
        med1.setPediatra(false);

        new AppPessoa("Inclusão do médico Luiz").relatorio(med1);

        Medico med2 = new Medico();
        med2.setNome("Regina");
        med2.setEmail("regina@medico.com");
        med2.setTelefone("219933558822");
        med2.setCrm("432124223");
        med2.setEspecialista(false);
        med2.setPediatra(false);

        new AppPessoa("Inclusão da médica Regina").relatorio(med2);

        Medico med3 = new Medico();
        med3.setNome("Maria Jose");
        med3.setEmail("maria@medico.com");
        med3.setTelefone("219911337755");
        med3.setCrm("643543623");
        med3.setEspecialista(true);
        med3.setPediatra(true);

        new AppPessoa("Inclusão da médica Maria José").relatorio(med3);
    }
}
