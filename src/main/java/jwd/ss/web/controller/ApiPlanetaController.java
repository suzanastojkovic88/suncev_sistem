package jwd.ss.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jwd.ss.model.Planeta;
import jwd.ss.model.Satelit;
import jwd.ss.service.PlanetaService;
import jwd.ss.service.SatelitService;
import jwd.ss.support.PlanetaToPlanetaDTO;
import jwd.ss.support.SatelitToSatelitDTO;
import jwd.ss.web.dto.PlanetaDTO;
import jwd.ss.web.dto.SatelitDTO;

@RestController
@RequestMapping(value="/api/planete")
public class ApiPlanetaController {
	@Autowired
	private PlanetaService planetaS;
	@Autowired
	private SatelitService satelitS;
	@Autowired
	private PlanetaToPlanetaDTO pToDTO;
	@Autowired
	private SatelitToSatelitDTO sToDTO;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<PlanetaDTO>> get(){
		return new ResponseEntity<>(
				pToDTO.convert(planetaS.findAll()),
				HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<PlanetaDTO> get(
			@PathVariable Long id){
		
		Planeta planeta = planetaS.findOne(id);
		
		if(planeta == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(
				pToDTO.convert(planeta),
				HttpStatus.OK);
	}
	
	@RequestMapping(value="/{planetaId}/sateliti")
	public ResponseEntity<List<SatelitDTO>> findByPlaneta(
			@PathVariable Long planetaId,
			@RequestParam(defaultValue="0") int pageNum){
		Page<Satelit> sateliti = satelitS.findByPlanetaId(pageNum, planetaId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("totalPages", Integer.toString(sateliti.getTotalPages()) );
		return  new ResponseEntity<>(
				sToDTO.convert(sateliti.getContent()),
				headers,
				HttpStatus.OK);
	}
}
