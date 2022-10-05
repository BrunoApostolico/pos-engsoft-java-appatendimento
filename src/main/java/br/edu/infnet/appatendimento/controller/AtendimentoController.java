package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Atendimento;
import br.edu.infnet.appatendimento.model.domain.Pessoa;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.service.AtendimentoService;
import br.edu.infnet.appatendimento.model.service.PacienteService;
import br.edu.infnet.appatendimento.model.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private PessoaService pessoaService;

    @GetMapping(value = "/atendimento")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("pacientes",pacienteService.obterLista(usuario));
        model.addAttribute("pessoas",pessoaService.obterLista(usuario));

        return "atendimento/cadastro";
    }

    @GetMapping(value = "/atendimento/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem",atendimentoService.obterLista());
        return "atendimento/lista";
    }
    @PostMapping(value = "/atendimento/incluir")
    public String incluir(Atendimento atendimento){

        System.out.println("Atendimento.id: " + atendimento.getId());
        System.out.println("Atendimento.descricao: " + atendimento.getDescricao());
        System.out.println("Atendimento.paciente.id: " + atendimento.getPaciente().getId());
        System.out.println("Atendimento.paciente.nome: " + atendimento.getPaciente().getNome());
        System.out.println("Atendimento.pessoas.size: " + atendimento.getPessoas().size());
        for(Pessoa pessoa : atendimento.getPessoas()){
            System.out.println("Atendimento.pessoa.id: " + pessoa.getId());
            System.out.println("Atendimento.pessoa.nome: " + pessoa.getNome());
        }

        return "redirect:/atendimento/lista";
    }

    @GetMapping(value = "/atendimento/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        atendimentoService.excluir(id);
        return "redirect:/atendimento/lista";
    }

}