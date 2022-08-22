package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Medico;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class MedicoController {
    private static Map<Integer, Medico> mapaMedico = new HashMap<Integer, Medico>();
    private static Integer id=1;
    public static void incluir(Medico medico){
        medico.setId(id++);

        mapaMedico.put(medico.getId(), medico);

        AppImpressao.relatorio("Inclusão do(a) médico " + medico.getNome() + " realizada com sucesso!!!", medico );
    }
    public static Collection<Medico> obterLista(){
        return mapaMedico.values();
    }

    public static void excluir(Integer id){
        mapaMedico.remove(id);
    }

    @GetMapping(value = "/medico/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem",obterLista());

        return "medico/lista";
    }
    @GetMapping(value = "/medico/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        excluir(id);
        return "redirect:/medico/lista";
    }
}