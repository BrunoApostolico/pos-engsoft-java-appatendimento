package br.edu.infnet.appatendimento.model.repository;

import br.edu.infnet.appatendimento.model.domain.Tecnico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface TecnicoRepository extends CrudRepository<Tecnico, Integer> {

    @Query("FROM Tecnico a WHERE a.usuario.id = :idUsuario")
    Collection<Tecnico> findAll(Integer idUsuario);
}
