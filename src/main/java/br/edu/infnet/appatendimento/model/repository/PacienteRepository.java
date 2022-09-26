package br.edu.infnet.appatendimento.model.repository;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer> {

    @Query("from Paciente p where p.usuario.id = :userid")
    List<Paciente> obterLista(Integer userid);

}
