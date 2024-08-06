package acc.br.CorridaJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import acc.br.CorridaJPA.model.Corrida;

@Repository
public interface CorridaRepository extends JpaRepository<Corrida, Long>
{
	List<Corrida> findByLocalId(Long localId);
	
	@Transactional
	void deleteByLocalId(Long localId);
}

