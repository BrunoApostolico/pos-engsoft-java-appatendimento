package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Tecnico;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class TecnicoController {

    @Autowired
    private TecnicoService tecnicoService;

    @GetMapping(value = "/tecnico/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("listagem",tecnicoService.obterLista(usuario));
        return "tecnico/lista";
    }

    @GetMapping(value = "/tecnico")
    public String telaCadastro(){
        return "tecnico/cadastro";
    }

    @PostMapping(value = "/tecnico/incluir")
    public String incluir(Tecnico tecnico, @SessionAttribute("user") Usuario usuario){
        tecnico.setUsuario(usuario);
        tecnicoService.incluir(tecnico);
        return "redirect:/tecnico/lista";
    }

    @GetMapping(value = "/tecnico/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        tecnicoService.excluir(id);
        return "redirect:/tecnico/lista";
    }
}