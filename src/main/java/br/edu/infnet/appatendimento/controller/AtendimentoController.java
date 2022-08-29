package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Atendimento;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class AtendimentoController {
    private static Map<Integer, Atendimento> mapaAtendimento = new HashMap<Integer, Atendimento>();
    private static Integer id = 1;
    public static void incluir(Atendimento atendimento){
        atendimento.setId(id++);
        mapaAtendimento.put(atendimento.getId(), atendimento);

        AppImpressao.relatorio("Inclusão do(a) atendimento " + atendimento.getPresencial()  + " realizada com sucesso!!!", atendimento);
    }
    public static Collection<Atendimento> obterLista(){
        return mapaAtendimento.values();
    }

    public static void excluir(Integer id){
        mapaAtendimento.remove(id);
    }

    @GetMapping(value = "/atendimento/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem",obterLista());
        return "atendimento/lista";
    }
    @GetMapping(value = "/atendimento/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        return "redirect:/atendimento/lista";
    }

}