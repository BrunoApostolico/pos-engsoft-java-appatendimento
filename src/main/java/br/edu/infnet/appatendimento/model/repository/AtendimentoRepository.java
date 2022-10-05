package br.edu.infnet.appatendimento.model.repository;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.domain.Atendimento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AtendimentoRepository extends CrudRepository<Atendimento, Integer> {

    @Query("FROM Atendimento a WHERE a.usuario.id = :idUsuario")
    Collection<Atendimento> findAll(Integer idUsuario);
}
