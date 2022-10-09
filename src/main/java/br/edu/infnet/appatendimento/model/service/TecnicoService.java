package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.domain.Tecnico;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.repository.AtendenteRepository;
import br.edu.infnet.appatendimento.model.repository.TecnicoRepository;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class TecnicoService {
    @Autowired
    private TecnicoRepository tecnicoRepository;

    public void incluir(Tecnico tecnico){
       tecnicoRepository.save(tecnico);

        AppImpressao.relatorio("Inclusão do(a) tecnico " + tecnico.getNome() + " realizada com sucesso!!!", tecnico);
    }
    public Collection<Tecnico> obterLista(){
        return (Collection<Tecnico>) tecnicoRepository.findAll();
    }

    public Collection<Tecnico> obterLista(Usuario usuario){
        return (Collection<Tecnico>) tecnicoRepository.findAll(usuario.getId());
    }


    public void excluir(Integer id){
        tecnicoRepository.deleteById(id);
    }
}
