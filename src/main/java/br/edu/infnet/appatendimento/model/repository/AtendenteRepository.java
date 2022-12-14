package br.edu.infnet.appatendimento.model.repository;

import br.edu.infnet.appatendimento.model.domain.Atendente;
import br.edu.infnet.appatendimento.model.domain.Paciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AtendenteRepository extends CrudRepository<Atendente, Integer> {

    @Query("FROM Atendente a WHERE a.usuario.id = :idUsuario")
    Collection<Atendente> findAll(Integer idUsuario);
}
