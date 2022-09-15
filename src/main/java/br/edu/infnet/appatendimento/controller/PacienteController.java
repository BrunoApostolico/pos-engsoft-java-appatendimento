package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import br.edu.infnet.appatendimento.model.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping(value = "/paciente/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem",pacienteService.obterLista());

        return "paciente/lista";
    }

    @GetMapping(value = "/paciente")
    public String telaCadastro(){
        return "paciente/cadastro";
    }

    @PostMapping(value = "/paciente/incluir")
    public String incluir(Paciente paciente) {

        pacienteService.incluir(paciente);

        return "redirect:/paciente/lista";
    }

    @GetMapping(value = "/paciente/{id}/excluir")
    public String excluir(@PathVariable Integer id){

        pacienteService.excluir(id);

        return "redirect:/paciente/lista";
    }
}