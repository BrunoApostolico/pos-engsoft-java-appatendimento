package br.edu.infnet.appatendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicoController {

    @GetMapping(value = "/medico/lista")
    public String telaLista(){
        return "medico/lista";
    }
}