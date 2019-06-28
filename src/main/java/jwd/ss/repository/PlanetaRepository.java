package jwd.ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jwd.ss.model.Planeta;

@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, Long>{

}
