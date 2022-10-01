package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.repository.AtendenteRepository;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AtendenteService {

    @Autowired
    private AtendenteRepository atendenteRepository;

    public void incluir(Atendente atendente){
        atendenteRepository.save(atendente);

        AppImpressao.relatorio("Inclusão do(a) atendente " + atendente.getNome() + " realizada com sucesso!!!", atendente);
    }

    public Collection<Atendente> obterLista(){
       return (Collection<Atendente>) atendenteRepository.findAll();
    }

    public Collection<Atendente> obterLista(Usuario usuario){
        return (Collection<Atendente>) atendenteRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        atendenteRepository.deleteById(id);
    }
}
