package jwd.ss.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jwd.ss.model.Satelit;
import jwd.ss.service.SatelitService;
import jwd.ss.support.SatelitToSatelitDTO;
import jwd.ss.web.dto.SatelitDTO;

@RestController
@RequestMapping("/api/sateliti")
public class ApiSatelitController {
	
	@Autowired
	private SatelitService satelitS;
	@Autowired
	private SatelitToSatelitDTO toDTO;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<SatelitDTO>> get(
			@RequestParam(required=false) Long planeta,
			@RequestParam(defaultValue="0") int pageNum){
		
		Page<Satelit> sateliti;
		
		if(planeta != null) {
			sateliti = satelitS.pretraga(planeta, pageNum);
		}else{
			sateliti = satelitS.findAll(pageNum);
		}
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("totalPages", Integer.toString(sateliti.getTotalPages()) );
		return  new ResponseEntity<>(
				toDTO.convert(sateliti.getContent()),
				headers,
				HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.GET,
					value="/{id}")
	public ResponseEntity<SatelitDTO> get(
			@PathVariable Long id){
		Satelit satelit = satelitS.findOne(id);
		
		if(satelit==null){
			return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(
				toDTO.convert(satelit),
				HttpStatus.OK);	
	}
	
	@ExceptionHandler
	public ResponseEntity<Void> validationHandler(
					DataIntegrityViolationException e){
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	

}
