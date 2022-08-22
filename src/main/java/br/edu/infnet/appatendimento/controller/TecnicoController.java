package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Tecnico;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class TecnicoController {
    private static Map<Integer, Tecnico> mapaTecnico = new HashMap<Integer, Tecnico>();
    private static Integer id = 1;
    public static void incluir(Tecnico tecnico){
        tecnico.setId(id++);

        mapaTecnico.put(tecnico.getId(), tecnico);

        AppImpressao.relatorio("Inclusão do(a) técnico " + tecnico.getNome() + " realizada com sucesso!!!", tecnico);
    }
    public static Collection<Tecnico> obterLista(){
        return mapaTecnico.values();
    }
    public static void excluir(Integer id){
        mapaTecnico.remove(id);
    }

    @GetMapping(value = "/tecnico/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem",obterLista());
        return "tecnico/lista";
    }
    @GetMapping(value = "/tecnico/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        return "redirect:/tecnico/lista";
    }
}
