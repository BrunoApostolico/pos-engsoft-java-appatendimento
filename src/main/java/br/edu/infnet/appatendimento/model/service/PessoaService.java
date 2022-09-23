package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private AtendenteService atendenteService;

    @Autowired
    private MedicoService medicoService;

    public List<Pessoa> obterLista(){

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.addAll(atendenteService.obterLista());
        pessoas.addAll(medicoService.obterLista());

        return pessoas;
    }
}
