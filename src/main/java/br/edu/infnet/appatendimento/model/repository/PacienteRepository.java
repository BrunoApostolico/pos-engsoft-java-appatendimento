package br.edu.infnet.appatendimento.model.repository;

import br.edu.infnet.appatendimento.model.domain.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer> {
}
