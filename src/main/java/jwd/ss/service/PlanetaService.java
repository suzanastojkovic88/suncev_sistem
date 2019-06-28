package jwd.ss.service;

import java.util.List;

import jwd.ss.model.Planeta;

public interface PlanetaService {
	
	List<Planeta> findAll();
	Planeta findOne (Long id);
	void save(Planeta planeta);
	void remove(Long id);

}
