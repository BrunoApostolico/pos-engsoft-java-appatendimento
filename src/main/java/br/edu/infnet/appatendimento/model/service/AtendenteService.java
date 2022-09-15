package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AtendenteService {
    private static Map<Integer, Atendente> mapaAtendente = new HashMap<Integer, Atendente>();
    private static Integer id = 1;

    public void incluir(Atendente atendente){
        atendente.setId(id++);

        mapaAtendente.put(atendente.getId(), atendente);

        AppImpressao.relatorio("Inclusão do(a) atendente " + atendente.getNome() + " realizada com sucesso!!!", atendente);
    }
    public Collection<Atendente> obterLista(){
        return mapaAtendente.values();
    }


    public void excluir(Integer id){
        mapaAtendente.remove(id);
    }
}
