package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.AtendimentoController;
import br.edu.infnet.appatendimento.model.domain.*;
import br.edu.infnet.appatendimento.model.exceptions.AtendimentoSemPessoaException;
import br.edu.infnet.appatendimento.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appatendimento.model.exceptions.PacienteNuloException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        String dir = "c:/Dev/pos-live/appatendimento/src/main/resources/";
        String arq = "atendimentos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){

                    try {

                        String[] campos = linha.split(";");

                        Set<Pessoa> listaPessoaP1 = new HashSet<Pessoa>();
                        listaPessoaP1.add(at1);
                        listaPessoaP1.add(med1);
                        listaPessoaP1.add(t1);
                        listaPessoaP1.add(t2);

                        Paciente paciente1 = new Paciente(campos[2],campos[3],Integer.parseInt(campos[4]));

                        Atendimento atd1 = new Atendimento(paciente1, listaPessoaP1);
                        atd1.setDescricao(campos[0]);
                        atd1.setPresencial(Boolean.valueOf(campos[1]));
                        AtendimentoController.incluir(atd1);
                    } catch (NomeInvalidoException | PacienteNuloException | AtendimentoSemPessoaException e) {
                        System.out.println("[ERROR] - PEDIDO " + e.getMessage());
                    }

                    linha = leitura.readLine();
                }

                leitura.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!!");
            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
            }
        } finally {
            System.out.println("Terminou!!");
        }
    }
}