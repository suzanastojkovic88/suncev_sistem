package jwd.ss.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import jwd.ss.model.Satelit;
import jwd.ss.repository.SatelitRepository;
import jwd.ss.service.SatelitService;

@Service
@Transactional
public class JpaSatelitServiceImpl implements SatelitService {
	
	@Autowired
	private SatelitRepository satelitR;
	
	@Override
	public Page<Satelit> findAll(int page){
		return satelitR.findAll(new PageRequest(page, 5));
	}
	
	@Override
	public Satelit findOne(Long id) {
		return satelitR.findOne(id);
	}
	
	@Override
	public void save(Satelit satelit) {
		satelitR.save(satelit);
	}
	
	@Override
	public void remove(Long id) {
		satelitR.delete(id);
	}
	
	@Override
	public Page<Satelit> findByPlanetaId(int page, Long planetaId) {
		
		return satelitR.findByPlanetaId(planetaId, new PageRequest(page, 5));
	}

	@Override
	public Page<Satelit> pretraga(Long planeta, int page) {
		return satelitR.pretraga(planeta, new PageRequest(page, 5));
	}
	
}
