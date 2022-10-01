package br.edu.infnet.appatendimento.model.service;

import br.edu.infnet.appatendimento.model.domain.Pessoa;
import br.edu.infnet.appatendimento.model.domain.Usuario;
import br.edu.infnet.appatendimento.model.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> obterLista(){
        return (List<Pessoa>) pessoaRepository.findAll();
    }

    public List<Pessoa> obterLista(Usuario usuario){
        return (List<Pessoa>) pessoaRepository.findAll(usuario.getId());
    }
    public void excluir(Integer id){
        pessoaRepository.deleteById(id);
    }
}


