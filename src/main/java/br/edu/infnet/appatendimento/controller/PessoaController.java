package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.domain.Pessoa;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.service.PessoaService;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping(value = "/pessoa/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("listagem",pessoaService.obterLista(usuario));

        return "atendente/lista";
    }

    @GetMapping(value = "/pessoa/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        pessoaService.excluir(id);
        return "redirect:/pessoa/lista";
    }
}
