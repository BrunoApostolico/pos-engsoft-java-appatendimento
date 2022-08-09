package br.edu.infnet.appatendimento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {

    @GetMapping(value = "/paciente/lista")
    public String telaLista(){
        return "paciente/lista";
    }
}
