package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.repository.PacienteRepository;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public void incluir(Paciente paciente) {
        pacienteRepository.save(paciente);

        AppImpressao.relatorio("Inclusão do(a) paciente " + paciente.getNome() + " realizada com sucesso!!!", paciente);
    }

    public Collection<Paciente> obterLista() {
        return (Collection<Paciente>) pacienteRepository.findAll();
    }

    public Collection<Paciente> obterLista(Usuario usuario) {
        return pacienteRepository.obterLista(usuario.getId());
    }

    public void excluir(Integer id) {
        pacienteRepository.deleteById(id);
    }
}
