package jwd.ss.service;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import jwd.ss.model.Satelit;

public interface SatelitService {

	Page<Satelit> findAll(int page);
	Satelit findOne(Long id);
	void save(Satelit satelit);
	void remove(Long id);
	Page<Satelit> findByPlanetaId(int pageNum, Long planetaId);
	Page<Satelit> pretraga( 
			@Param("planeta") Long planeta, 
			int page);
}
