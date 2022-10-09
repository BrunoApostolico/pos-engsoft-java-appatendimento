package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Medico;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @GetMapping(value = "/medico/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("listagem",medicoService.obterLista(usuario));

        return "medico/lista";
    }

   @GetMapping(value = "/medico")
    public String telaCadastro(){
        return "medico/cadastro";
    }

    @PostMapping(value = "/medico/incluir")
    public String incluir(Medico medico, @SessionAttribute("user") Usuario usuario){

        medico.setUsuario(usuario);

        medicoService.incluir(medico);

        return "redirect:/medico/lista";
    }

    @GetMapping(value = "/medico/{id}/excluir")
    public String excluir(@PathVariable Integer id){

        medicoService.excluir(id);

        return "redirect:/medico/lista";
    }

}