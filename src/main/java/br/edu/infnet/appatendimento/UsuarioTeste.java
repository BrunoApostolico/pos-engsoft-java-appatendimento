package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.UsuarioController;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UsuarioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Usuario usuario = new Usuario();
        usuario.setEmail("admin@admin.com");
        usuario.setNome("Administrador");
        usuario.setSenha("123");

        UsuarioController.incluir(usuario);

    }
}
