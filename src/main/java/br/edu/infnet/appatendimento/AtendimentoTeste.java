package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.*;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@Order(1)
public class AtendimentoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n#Atendimento");

        Atendente at1 = new Atendente();
        at1.setNome("Karen");
        at1.setTelefone("2499885577");
        at1.setEmail("karen@atendimento.com");
        at1.setIdade(19);
        at1.setFormacao("Ensino Médio");
        at1.setTurno("Dia");

        Medico med1 = new Medico();
        med1.setNome("Luiz");
        med1.setEmail("luiz@medico.com");
        med1.setTelefone("21 99225-4433");
        med1.setCrm("123123123");
        med1.setEspecialista(true);
        med1.setPediatra(false);

        Tecnico t1 = new Tecnico();
        t1.setNome("Priscila");
        t1.setEmail("priscila@tecnica.com");
        t1.setTelefone("21993638628");
        t1.setCoren("123123123");
        t1.setDiarista(true);
        t1.setSexo("Feminino");

        //Cria a coleção
        Set<Pessoa> listaPessoaP1 = new HashSet<Pessoa>();
        //adiciona produtos à coleção
        listaPessoaP1.add(at1);
        listaPessoaP1.add(med1);

        Paciente paciente1 = new Paciente("Bruno","993703274",36);

        Atendimento atd1 = new Atendimento(paciente1); // instanciar a classe Atendimento, criando espaço na memoria para armazenar o obj
        atd1.setLocal("Local 1");
        atd1.setPessoas(listaPessoaP1); //atribuição
        AppImpressao.relatorio("Inclusão do atendimento 1", atd1);

        Set<Pessoa> listaPessoaP2 = new HashSet<Pessoa>();
        listaPessoaP2.add(t1);

        Paciente paciente2 = new Paciente("Priscila","993638628",36);

        Atendimento atd2 = new Atendimento(paciente2);
        atd2.setLocal("Local 2");
        atd2.setPessoas(listaPessoaP2);
        AppImpressao.relatorio("Inclusão do atendimento 2", atd2);

        Set<Pessoa> listaPessoaP3 = new HashSet<Pessoa>();
        listaPessoaP3.add(at1);
        listaPessoaP3.add(med1);
        listaPessoaP3.add(t1);

        Paciente paciente3 = new Paciente("Eloah","999998877",6);

        Atendimento atd3 = new Atendimento(paciente3);
        atd3.setLocal("Local 3");
        atd3.setPessoas(listaPessoaP3);
        AppImpressao.relatorio("Inclusão do atendimento 3", atd3);

    }
}
