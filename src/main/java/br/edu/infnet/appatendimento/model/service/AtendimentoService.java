package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Atendimento;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AtendimentoService {
    private static Map<Integer, Atendimento> mapaAtendimento = new HashMap<Integer, Atendimento>();
    private static Integer id = 1;

    public void incluir(Atendimento atendimento){
        atendimento.setId(id++);
        mapaAtendimento.put(atendimento.getId(), atendimento);

        AppImpressao.relatorio("Inclusão do(a) atendimento " + atendimento.getPresencial()  + " realizada com sucesso!!!", atendimento);
    }

    public Collection<Atendimento> obterLista(){
        return mapaAtendimento.values();
    }

    public void excluir(Integer id){
        mapaAtendimento.remove(id);
    }
}
