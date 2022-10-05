package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Atendimento;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.repository.AtendenteRepository;
import br.edu.infnet.appatendimento.model.repository.AtendimentoRepository;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    public void incluir(Atendimento atendimento){
        atendimentoRepository.save(atendimento);

        AppImpressao.relatorio("Inclusão do(a) atendimento " + atendimento.getPresencial()  + " realizada com sucesso!!!", atendimento);
    }

    public Collection<Atendimento> obterLista(){
        return (Collection<Atendimento>) atendimentoRepository.findAll();
    }

    public Collection<Atendimento> obterLista(Usuario usuario){
        return (Collection<Atendimento>) atendimentoRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        atendimentoRepository.deleteById(id);
    }
}
