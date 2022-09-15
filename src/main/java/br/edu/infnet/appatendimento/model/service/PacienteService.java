package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import br.edu.infnet.appatendimento.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PacienteService {
    private static Map<Integer, Paciente> mapaPaciente = new HashMap<Integer, Paciente>();

    private static Integer id=1;

    public void incluir(Paciente paciente){
        paciente.setId(id++);
        mapaPaciente.put(paciente.getId(), paciente);

        AppImpressao.relatorio("Inclusão do(a) paciente " + paciente.getNome() + " realizada com sucesso!!!", paciente);
    }

    public Collection<Paciente> obterLista(){
        return mapaPaciente.values();
    }

    public void excluir(Integer id){
        mapaPaciente.remove(id);
    }
}
