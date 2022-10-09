package br.edu.infnet.appatendimento.model.repository;

import br.edu.infnet.appatendimento.model.domain.Medico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MedicoRepository extends CrudRepository<Medico, Integer> {

    @Query("FROM Medico a WHERE a.usuario.id = :idUsuario")
    Collection<Medico> findAll(Integer idUsuario);
}
