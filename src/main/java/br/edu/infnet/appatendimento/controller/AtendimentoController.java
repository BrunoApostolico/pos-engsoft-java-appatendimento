package br.edu.infnet.appatendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AtendimentoController {

    @GetMapping(value = "/atendimento/lista")
    public String telaLista(){
        return "atendimento/lista";
    }
}
