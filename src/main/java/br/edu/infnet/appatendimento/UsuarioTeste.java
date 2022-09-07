package br.edu.infnet.appatendimento;

import br.edu.infnet.appatendimento.controller.AtendimentoController;
import br.edu.infnet.appatendimento.model.domain.Atendimento;
import br.edu.infnet.appatendimento.model.domain.Paciente;
import br.edu.infnet.appatendimento.model.domain.Pessoa;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.exceptions.AtendimentoSemPessoaException;
import br.edu.infnet.appatendimento.model.exceptions.NomeInvalidoException;
import br.edu.infnet.appatendimento.model.exceptions.PacienteNuloException;
import br.edu.infnet.appatendimento.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Component
public class UsuarioTeste implements ApplicationRunner {
    @Autowired
    private UsuarioService usuarioService;

    private Usuario usuario;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        usuario = new Usuario();
        usuario.setEmail("admin@admin.com");
        usuario.setNome("Administrador");
        usuario.setSenha("123");

        usuarioService.incluir(usuario);

        //-------------------------
        String dir = "c:/Dev/pos-live/appatendimento/src/main/resources/";
        String arq = "usuarios.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir+arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){

                    String[] campos = linha.split(";");

                    usuario = new Usuario();
                    usuario.setEmail(campos[0]);
                    usuario.setNome(campos[1]);
                    usuario.setSenha(campos[2]);

                    usuarioService.incluir(usuario);

                    linha = leitura.readLine();
                }

                leitura.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!!");
            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
            }
        } finally {
            System.out.println("Terminou!!");
        }

    }
}
