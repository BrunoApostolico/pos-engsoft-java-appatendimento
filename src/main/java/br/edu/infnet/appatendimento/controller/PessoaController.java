package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.domain.Pessoa;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PessoaController {
    private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
    public static void incluir(Pessoa pessoa){
        pessoas.add(pessoa);
        AppImpressao.relatorio("Inclusão do(a) pessoa " + pessoa.getNome() + " realizada com sucesso!!!", pessoa);
    }

    @GetMapping(value = "/pessoa/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem",pessoas);
        return "pessoa/lista";
    }
}
