package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    private String mensagem;
    private String tipo;

    @GetMapping(value = "/paciente/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario user){

        model.addAttribute("listagem",pacienteService.obterLista(user));

        model.addAttribute("mensagem",mensagem);
        model.addAttribute("tipo",tipo);


        return "paciente/lista";
    }

    @GetMapping(value = "/paciente")
    public String telaCadastro(){
        return "paciente/cadastro";
    }

    @PostMapping(value = "/paciente/incluir")
    public String incluir(Paciente paciente, @SessionAttribute("user")Usuario usuario) {

        paciente.setUsuario(usuario);

        pacienteService.incluir(paciente);

        mensagem = "Inclusão do Paciente " + paciente.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";

        return "redirect:/paciente/lista";
    }

    @GetMapping(value = "/paciente/{id}/excluir")
    public String excluir(@PathVariable Integer id){

        try{
            pacienteService.excluir(id);
            mensagem = "Exclusão do Paciente " + id + " realizada com sucesso!!!";
            tipo = "alert-success";
        }catch (Exception e){
            mensagem = "Impossível realizar a exclusão do Paciente " + id + " !!!";
            tipo = "alert-danger";
        }
        return "redirect:/paciente/lista";
    }
}