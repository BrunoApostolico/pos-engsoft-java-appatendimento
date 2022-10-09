package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.service.AtendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AtendenteController {
    @Autowired
    private AtendenteService atendenteService;

    @GetMapping(value = "/atendente/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("listagem",atendenteService.obterLista(usuario));

        return "atendente/lista";
    }

    @GetMapping(value = "/atendente")
    public String telaCadastro(){
        return "atendente/cadastro";
    }

    @PostMapping(value = "/atendente/incluir")
    public String incluir(Atendente atendente, @SessionAttribute("user") Usuario usuario){

        atendente.setUsuario(usuario);

        atendenteService.incluir(atendente);

        return "redirect:/atendente/lista";
    }

    @GetMapping(value = "/atendente/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        atendenteService.excluir(id);
        return "redirect:/atendente/lista";
    }
}