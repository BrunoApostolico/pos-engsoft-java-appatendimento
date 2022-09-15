package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Medico;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MedicoService {
    private static Map<Integer, Medico> mapaMedico = new HashMap<Integer, Medico>();
    private static Integer id = 1;

    public void incluir(Medico medico){
        medico.setId(id++);

        mapaMedico.put(medico.getId(), medico);

        AppImpressao.relatorio("Inclusão do(a) medico " + medico.getNome() + " realizada com sucesso!!!", medico);
    }
    public Collection<Medico> obterLista(){
        return mapaMedico.values();
    }


    public void excluir(Integer id){
        mapaMedico.remove(id);
    }
}
