package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class AtendenteController {
    private static Map<Integer, Atendente> mapaAtendente = new HashMap<Integer, Atendente>();
    private static Integer id = 1;
    public static void incluir(Atendente atendente){
        atendente.setId(id++);

        mapaAtendente.put(atendente.getId(), atendente);

        AppImpressao.relatorio("Inclusão do(a) atendente " + atendente.getNome() + " realizada com sucesso!!!", atendente);
    }
    public static Collection<Atendente> obterLista(){
        return mapaAtendente.values();
    }


    public static void excluir(Integer id){
        mapaAtendente.remove(id);
    }

    @GetMapping(value = "/atendente/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem",obterLista());

        return "atendente/lista";
    }
    @GetMapping(value = "/atendente/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        return "redirect:/atendente/lista";
    }
}