package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Medico;
import br.edu.infnet.appatendimento.model.domain.Paciente;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PacienteController {
    private static Map<Integer, Paciente > mapaPaciente = new HashMap<Integer, Paciente>();

    private static Integer id=1;
    public static void incluir(Paciente paciente){
        paciente.setId(id++);
        mapaPaciente.put(paciente.getId(), paciente);
        AppImpressao.relatorio("Inclusão do(a) paciente " + paciente.getNome() + " realizada com sucesso!!!", paciente);
    }
    public static Collection<Paciente> obterLista(){
        return mapaPaciente.values();
    }

    public static void excluir(Integer id){
        mapaPaciente.remove(id);
    }

    @GetMapping(value = "/paciente/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem",obterLista());
        return "paciente/lista";
    }
    @GetMapping(value = "/paciente/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        return "redirect:/paciente/lista";
    }
}