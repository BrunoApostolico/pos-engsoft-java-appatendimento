package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Atendimento;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AtendimentoController {
    private static List<Atendimento> atendimentos = new ArrayList<Atendimento>();
    public static void incluir(Atendimento atendimento){
        atendimentos.add(atendimento);
        AppImpressao.relatorio("Inclusão do(a) atendimento " + atendimento.getLocal() + " realizada com sucesso!!!", atendimento);
    }

    @GetMapping(value = "/atendimento/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem",atendimentos);
        return "atendimento/lista";
    }
}