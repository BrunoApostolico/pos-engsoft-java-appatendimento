package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.model.domain.*;
import br.edu.infnet.appatendimento.model.exceptions.AtendimentoSemPessoaException;
import br.edu.infnet.appatendimento.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appatendimento.model.exceptions.PacienteNuloException;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Order(1)
public class AtendimentoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\n####Atendimento");

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

        Tecnico t2 = new Tecnico();
        t2.setNome("Vanessa");
        t2.setEmail("vanessa@tecnica.com");
        t2.setTelefone("21993638628");
        t2.setCoren("123123123");
        t2.setDiarista(false);
        t2.setSexo("Feminino");

        //-------------------------
        try {
            Set<Pessoa> listaPessoaP1 = new HashSet<Pessoa>();
            listaPessoaP1.add(at1);
            listaPessoaP1.add(med1);
            listaPessoaP1.add(t1);
            listaPessoaP1.add(t2);

            Paciente paciente1 = new Paciente("Bruno","993703274",36);

            Atendimento atd1 = new Atendimento(paciente1, listaPessoaP1);
            atd1.setLocal("Local 1");
            AppImpressao.relatorio("Inclusão do Atendimento 1!!!",atd1);
        } catch (NomeInvalidoException | PacienteNuloException | AtendimentoSemPessoaException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        //---------------------------
        try {
            Set<Pessoa> listaPessoaP2 = new HashSet<Pessoa>();
            listaPessoaP2.add(at1);
            listaPessoaP2.add(t1);

            Paciente paciente2 = new Paciente("Priscila","993638628",36);

            Atendimento atd2 = new Atendimento(paciente2, listaPessoaP2);
            atd2.setLocal("Local 2");
            AppImpressao.relatorio("Inclusão do Atendimento 2!!!",atd2);
        } catch (NomeInvalidoException | PacienteNuloException | AtendimentoSemPessoaException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        //---------------------------
        try {
            Set<Pessoa> listaPessoaP3 = new HashSet<Pessoa>();
            listaPessoaP3.add(at1);
            listaPessoaP3.add(med1);
            listaPessoaP3.add(t2);

            Paciente paciente3 = new Paciente("Eloah","999998877",6);

            Atendimento atd3 = new Atendimento(paciente3, listaPessoaP3);
            atd3.setLocal("Local 3");
            AppImpressao.relatorio("Inclusão do Atendimento 3!!!",atd3);
        } catch (NomeInvalidoException | PacienteNuloException | AtendimentoSemPessoaException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        try {
            Set<Pessoa> listaPessoaP4 = new HashSet<Pessoa>();
            listaPessoaP4.add(at1);
            listaPessoaP4.add(med1);
            listaPessoaP4.add(t2);

            Paciente paciente4 = new Paciente("Eloah","999998877",6);

            Atendimento atd4 = new Atendimento(null, listaPessoaP4);
            atd4.setLocal("Local 4");
            AppImpressao.relatorio("Inclusão do Atendimento 4!!!",atd4);
        } catch (NomeInvalidoException | PacienteNuloException | AtendimentoSemPessoaException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        try {
            Set<Pessoa> listaPessoaP5 = new HashSet<Pessoa>();

            Paciente paciente5 = new Paciente("Eloah","999998877",6);

            Atendimento atd5 = new Atendimento(paciente5, listaPessoaP5);
            atd5.setLocal("Local 5");
            AppImpressao.relatorio("Inclusão do Atendimento 5!!!",atd5);
        } catch (NomeInvalidoException | PacienteNuloException | AtendimentoSemPessoaException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }

        try {
            Set<Pessoa> listaPessoaP6 = null;

            Paciente paciente6 = new Paciente("Eloah","999998877",6);

            Atendimento atd6 = new Atendimento(paciente6, listaPessoaP6);
            atd6.setLocal("Local 6");
            AppImpressao.relatorio("Inclusão do Atendimento 6!!!",atd6);
        } catch (NomeInvalidoException | PacienteNuloException | AtendimentoSemPessoaException e) {
            System.out.println("[ERROR] - PEDIDO " + e.getMessage());
        }
    }
}
