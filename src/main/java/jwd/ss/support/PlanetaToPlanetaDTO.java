package jwd.ss.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import jwd.ss.model.Planeta;
import jwd.ss.web.dto.PlanetaDTO;

@Component
public class PlanetaToPlanetaDTO  
	implements Converter<Planeta, PlanetaDTO>{
	
	@Override
	public PlanetaDTO convert(Planeta planeta) {
		PlanetaDTO planetaDTO = new PlanetaDTO();
		planetaDTO.setId(planeta.getId());
		planetaDTO.setNaziv(planeta.getNaziv());
		planetaDTO.setUdaljenostOdSunca(planeta.getUdaljenostOdSunca());
		planetaDTO.setVremeRotacije(planeta.getVremeRotacije());
		planetaDTO.setVremeRevolucije(planeta.getVremeRevolucije());
		planetaDTO.setPrecnik(planeta.getPrecnik());
		planetaDTO.setBrSatelita(planeta.getBrSatelita());

		return planetaDTO;
	}
	
	public List<PlanetaDTO> convert(List<Planeta> planete){
		List<PlanetaDTO> ret = new ArrayList<>();
		
		for(Planeta p : planete) {
			ret.add(convert(p));
		}
		return ret;
	}
}
