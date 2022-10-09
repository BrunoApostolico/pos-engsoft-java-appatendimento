package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.domain.Medico;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.repository.AtendenteRepository;
import br.edu.infnet.appatendimento.model.repository.MedicoRepository;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    public void incluir(Medico medico){

        medicoRepository.save(medico);

        AppImpressao.relatorio("Inclusão do(a) medico " + medico.getNome() + " realizada com sucesso!!!", medico);
    }
    public Collection<Medico> obterLista(){
        return (Collection<Medico>) medicoRepository.findAll();
    }

    public Collection<Medico> obterLista(Usuario usuario){
        return (Collection<Medico>) medicoRepository.findAll(usuario.getId());
    }


    public void excluir(Integer id){
        medicoRepository.deleteById(id);
    }
}
