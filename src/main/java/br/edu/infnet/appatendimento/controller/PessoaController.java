package br.edu.infnet.appatendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PessoaController {

    @GetMapping(value = "/pessoa/lista")
    public String telaLista(){
        return "pessoa/lista";
    }
}
