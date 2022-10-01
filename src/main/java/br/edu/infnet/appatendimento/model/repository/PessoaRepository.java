package br.edu.infnet.appatendimento.model.repository;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.domain.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

    @Query("FROM Pessoa p WHERE p.usuario.id = :idUsuario")
    Collection<Pessoa> findAll(Integer idUsuario);
}
