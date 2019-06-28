package jwd.ss.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import jwd.ss.model.Satelit;
import jwd.ss.web.dto.SatelitDTO;

@Component
public class SatelitToSatelitDTO
	implements Converter<Satelit, SatelitDTO>{
	
	@Override
	public SatelitDTO convert(Satelit satelit) {
		SatelitDTO satelitDTO = new SatelitDTO();
		satelitDTO.setId(satelit.getId());
		satelitDTO.setNaziv(satelit.getNaziv());
		satelitDTO.setGodinaOtkrica(satelit.getGodinaOtkrica());
		satelitDTO.setPlanetaId(satelit.getPlaneta().getId());
		satelitDTO.setPlanetaNaziv(satelit.getPlaneta().getNaziv());

		return satelitDTO;
	}
	
	public List<SatelitDTO> convert(List<Satelit> sateliti){
		List<SatelitDTO> ret = new ArrayList<>();
		
		for(Satelit s : sateliti) {
			ret.add(convert(s));
		}
		
		return ret;
	}

}
