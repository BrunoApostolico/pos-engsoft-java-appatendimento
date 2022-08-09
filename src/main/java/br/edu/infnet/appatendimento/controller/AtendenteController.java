package br.edu.infnet.appatendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AtendenteController {

    @GetMapping(value = "/atendente/lista")
    public String telaLista(){
        return "atendente/lista";
    }
}
