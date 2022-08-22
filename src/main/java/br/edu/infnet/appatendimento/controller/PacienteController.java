package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PacienteController {
    private static List<Paciente> pacientes = new ArrayList<Paciente>();
    public static void incluir(Paciente paciente){
        pacientes.add(paciente);
        AppImpressao.relatorio("Inclusão do(a) paciente " + paciente.getNome() + " realizada com sucesso!!!", paciente);
    }

    @GetMapping(value = "/paciente/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem",pacientes);
        return "paciente/lista";
    }
}