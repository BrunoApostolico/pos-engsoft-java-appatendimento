package br.edu.infnet.appatendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TecnicoController {

    @GetMapping(value = "/tecnico/lista")
    public String telaLista(){
        return "tecnico/lista";
    }
}
