package jwd.ss;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jwd.ss.model.Planeta;
import jwd.ss.model.Satelit;
import jwd.ss.service.PlanetaService;
import jwd.ss.service.SatelitService;

@Component
public class Test {

	@Autowired
	private PlanetaService planetaS;
	
	@Autowired
	private SatelitService satelitS;
	
	@PostConstruct
	public void init() {
		
		Planeta p1 = new Planeta();
		p1.setNaziv("Merkur");
		p1.setUdaljenostOdSunca(0.387);
		p1.setVremeRotacije(58.6);
		p1.setVremeRevolucije(0.241);
		p1.setPrecnik(4878);
		p1.setBrSatelita(0);
		planetaS.save(p1);
		
		Planeta p2 = new Planeta();
		p2.setNaziv("Venera");
		p2.setUdaljenostOdSunca(0.72);
		p2.setVremeRotacije(243.0);
		p2.setVremeRevolucije(0.615);
		p2.setPrecnik(12104);
		p2.setBrSatelita(0);
		planetaS.save(p2);
		
		Planeta p3 = new Planeta();
		p3.setNaziv("Zemlja");
		p3.setUdaljenostOdSunca(1.0);
		p3.setVremeRotacije(1.0);
		p3.setVremeRevolucije(1.0);
		p3.setPrecnik(12756);
		p3.setBrSatelita(1);
		planetaS.save(p3);
		
		Planeta p4 = new Planeta();
		p4.setNaziv("Mars");
		p4.setUdaljenostOdSunca(1.52);
		p4.setVremeRotacije(1.03);
		p4.setVremeRevolucije(1.88);
		p4.setPrecnik(6787);
		p4.setBrSatelita(2);
		planetaS.save(p4);
		
		Planeta p5 = new Planeta();
		p5.setNaziv("Jupiter");
		p5.setUdaljenostOdSunca(5.205);
		p5.setVremeRotacije(0.414);
		p5.setVremeRevolucije(11.86);
		p5.setPrecnik(142796);
		p5.setBrSatelita(67);
		planetaS.save(p5);
		
		Planeta p6 = new Planeta();
		p6.setNaziv("Saturn");
		p6.setUdaljenostOdSunca(9.585);
		p6.setVremeRotacije(0.426);
		p6.setVremeRevolucije(29.46);
		p6.setPrecnik(120660);
		p6.setBrSatelita(62);
		planetaS.save(p6);
		
		Planeta p7 = new Planeta();
		p4.setNaziv("Uran");
		p4.setUdaljenostOdSunca(19.23);
		p4.setVremeRotacije(0.718);
		p4.setVremeRevolucije(84.01);
		p4.setPrecnik(51118);
		p4.setBrSatelita(27);
		planetaS.save(p7);
		
		Planeta p8 = new Planeta();
		p4.setNaziv("Neptun");
		p4.setUdaljenostOdSunca(30.1);
		p4.setVremeRotacije(0.671);
		p4.setVremeRevolucije(164.79);
		p4.setPrecnik(48600);
		p4.setBrSatelita(14);
		planetaS.save(p8);
		
		Satelit s1 = new Satelit();
		s1.setNaziv("Mesec");
		s1.setGodinaOtkrica(null);
		s1.setPlaneta(p3);
		satelitS.save(s1);
		
		Satelit s2 = new Satelit();
		s2.setNaziv("Fobos");
		s2.setGodinaOtkrica(1877);
		s2.setPlaneta(p4);
		satelitS.save(s2);
		
		Satelit s3 = new Satelit();
		s3.setNaziv("Deimos");
		s3.setGodinaOtkrica(1877);
		s3.setPlaneta(p4);
		satelitS.save(s3);
		
		Satelit s4 = new Satelit();
		s4.setNaziv("Ganimed");
		s4.setGodinaOtkrica(1609);
		s4.setPlaneta(p5);
		satelitS.save(s4);
		
		Satelit s5 = new Satelit();
		s5.setNaziv("Kalisto");
		s5.setGodinaOtkrica(1610);
		s5.setPlaneta(p5);
		satelitS.save(s5);
		
		Satelit s6 = new Satelit();
		s6.setNaziv("Evropa");
		s6.setGodinaOtkrica(1610);
		s6.setPlaneta(p5);
		satelitS.save(s6);
		
		Satelit s7 = new Satelit();
		s7.setNaziv("Titan");
		s7.setGodinaOtkrica(1655);
		s7.setPlaneta(p6);
		satelitS.save(s7);
		
		Satelit s8 = new Satelit();
		s8.setNaziv("Reja");
		s8.setGodinaOtkrica(1672);
		s8.setPlaneta(p6);
		satelitS.save(s8);
		
		Satelit s9 = new Satelit();
		s9.setNaziv("Titanija");
		s9.setGodinaOtkrica(1787);
		s9.setPlaneta(p7);
		satelitS.save(s9);
		
		Satelit s10 = new Satelit();
		s10.setNaziv("Oberon");
		s10.setGodinaOtkrica(1787);
		s10.setPlaneta(p7);
		satelitS.save(s10);
		
		Satelit s11 = new Satelit();
		s11.setNaziv("Triton");
		s11.setGodinaOtkrica(1846);
		s11.setPlaneta(p8);
		satelitS.save(s11);
		
		Satelit s12 = new Satelit();
		s12.setNaziv("Nereida");
		s12.setGodinaOtkrica(1949);
		s12.setPlaneta(p8);
		satelitS.save(s12);
	}
}