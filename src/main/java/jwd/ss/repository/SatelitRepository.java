package jwd.ss.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jwd.ss.model.Satelit;

@Repository
public interface SatelitRepository extends JpaRepository<Satelit, Long> {

	Page<Satelit> findByPlanetaId(Long planetaId, Pageable pR);
	
	@Query("SELECT s FROM Satelit s WHERE "
			+ "(:planeta IS NULL or s.planeta.id = :planeta)"
			)
	Page<Satelit> pretraga(@Param("planeta") Long planeta, Pageable pR);
}
