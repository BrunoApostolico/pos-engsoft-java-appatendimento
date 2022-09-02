package br.edu.infnet.appatendimento.controller;

import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UsuarioController {
    private static Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();

    public static void incluir(Usuario usuario){
        mapaUsuario.put(usuario.getEmail(), usuario);

        AppImpressao.relatorio("Inclusão do(a) usuario " + usuario.getNome() + " realizada com sucesso!!!", usuario);
    }

    public static Collection<Usuario> obterLista(){
        return mapaUsuario.values();
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem",obterLista());

        return "usuario/lista";
    }
}
