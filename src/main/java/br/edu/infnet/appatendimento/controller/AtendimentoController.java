package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.service.AtendimentoService;
import br.edu.infnet.appatendimento.model.service.PacienteService;
import br.edu.infnet.appatendimento.model.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private PessoaService pessoaService;

    @GetMapping(value = "/atendimento")
    public String telaCadastro(Model model){

        model.addAttribute("pacientes",pacienteService.obterLista());
        model.addAttribute("pessoas",pessoaService.obterLista());

        return "atendimento/cadastro";
    }

    @GetMapping(value = "/atendimento/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem",atendimentoService.obterLista());
        return "atendimento/lista";
    }
    @PostMapping(value = "/atendimento/incluir")
    public String incluir(){

        return "redirect:/atendimento/lista";
    }

    @GetMapping(value = "/atendimento/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        atendimentoService.excluir(id);
        return "redirect:/atendimento/lista";
    }

}