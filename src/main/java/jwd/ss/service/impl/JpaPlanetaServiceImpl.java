package jwd.ss.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jwd.ss.model.Planeta;
import jwd.ss.repository.PlanetaRepository;
import jwd.ss.service.PlanetaService;

@Service
@Transactional
public class JpaPlanetaServiceImpl implements PlanetaService {
	
	@Autowired
	private PlanetaRepository planetaR;
	
	@Override
	public List<Planeta> findAll() {
		return planetaR.findAll();
		
	}
	
	@Override
	public Planeta findOne(Long id) {
		return planetaR.findOne(id);
	}
	
	@Override
	public void save(Planeta planeta) {
		planetaR.save(planeta);
	}
	
	@Override
	public void remove(Long id) {
		planetaR.delete(id);
	}

}
