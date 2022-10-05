package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.AtendimentoController;
import br.edu.infnet.appatendimento.model.domain.*;
import br.edu.infnet.appatendimento.model.exceptions.AtendimentoSemPessoaException;
import br.edu.infnet.appatendimento.model.exceptions.IdadeAtendenteInvalidoException;
import br.edu.infnet.appatendimento.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appatendimento.model.exceptions.PacienteNuloException;
import br.edu.infnet.appatendimento.model.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@Order(6)
public class AtendimentoTeste implements ApplicationRunner {

    @Autowired
    private AtendimentoService atendimentoService;

    @Override
    public void run(ApplicationArguments args) {
        try {
            Usuario usuario = new Usuario();
            usuario.setId(1);

            Paciente paciente = new Paciente();
            paciente.setId(1);

            Set<Pessoa> pessoas = new HashSet<Pessoa>();

            Atendente at1 = new Atendente();
            at1.setId(1);
            at1.setNome("Atendente1");
            Atendente at2 = new Atendente();
            at2.setId(2);
            at2.setNome("Atendente2");
            Atendente at3 = new Atendente();
            at3.setId(3);
            at3.setNome("Atendente3");

            pessoas.add(at1);
            pessoas.add(at2);
            pessoas.add(at3);

            Atendimento atendimento = new Atendimento(paciente, pessoas);
            atendimento.setDescricao("Primeiro atendimento");
            atendimento.setPresencial(true);
            atendimento.setUsuario(usuario);

            atendimentoService.incluir(atendimento);
        } catch (PacienteNuloException | AtendimentoSemPessoaException e) {
            e.printStackTrace();
        }


//        System.out.println("\n####Atendimento");
//
//
//        //-------------------------
//        final String dir = "src/main/resources/";
//        String arq = "atendimentos.txt";
//
//        try {
//            try {
//                FileReader fileReader = new FileReader(dir+arq);
//                BufferedReader leitura = new BufferedReader(fileReader);
//
//                Set<Pessoa> pessoas = null;
//                List<Atendimento> atendimentos = new ArrayList<Atendimento>();
//
//                String linha = leitura.readLine();
//
//                while (linha != null){
//
//                    String[] campos = linha.split(";");
//
//                    switch (campos[0].toUpperCase()) {
//                        case "AT":
//                            try {
//                                pessoas = new HashSet<Pessoa>();
//
//                                Paciente paciente1 = new Paciente(campos[3],campos[4],Integer.parseInt(campos[5]));
//
//                                Atendimento atendimento = new Atendimento(paciente1, pessoas);
//                                atendimento.setDescricao(campos[1]);
//                                atendimento.setPresencial(Boolean.valueOf(campos[2]));
//
//                                atendimentos.add(atendimento);
//
//                            } catch (NomeInvalidoException | PacienteNuloException | AtendimentoSemPessoaException e) {
//                                System.out.println("[ERROR] - PEDIDO " + e.getMessage());
//                            }
//                            break;
//
//                        case "A":
//                                Atendente atendente = new Atendente();
//                                atendente.setNome(campos[1]);
//                                atendente.setTelefone(campos[2]);
//                                atendente.setEmail(campos[3]);
//                                atendente.setIdade(Integer.parseInt(campos[4]));
//                                atendente.setFormacao(campos[5]);
//                                atendente.setTurno(campos[6]);
//
//                                pessoas.add(atendente);
//
//                            break;
//
//                        case "M":
//                            Medico medico = new Medico();
//                            medico.setNome(campos[1]);
//                            medico.setTelefone(campos[2]);
//                            medico.setEmail(campos[3]);
//                            medico.setCrm(campos[4]);
//                            medico.setEspecialista(Boolean.parseBoolean(campos[5]));
//                            medico.setPediatra(Boolean.parseBoolean(campos[6]));
//                            medico.setAnoFormacao(Integer.parseInt(campos[7]));
//
//                            pessoas.add(medico);
//
//                            break;
//
//                        case "T":
//                            break;
//
//                        default:
//                            break;
//                    }
//
//                    linha = leitura.readLine();
//                }
//                for(Atendimento atd : atendimentos){
//                    atendimentoService.incluir(atd);
//                    System.out.println(">>>>>>>>>" + atd.getId());
//                    System.out.println(">>>>>>>" + atd.getPaciente().getNome());
//                    System.out.println(">>>>>" + atd.getPessoas().size());
//                }
//
//                leitura.close();
//                fileReader.close();
//
//            } catch (FileNotFoundException e) {
//                System.out.println("[ERRO] O arquivo não existe!!!");
//            } catch (IOException e) {
//                System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
//            }
//        } finally {
//            System.out.println("Terminou!!");
//        }
    }
}