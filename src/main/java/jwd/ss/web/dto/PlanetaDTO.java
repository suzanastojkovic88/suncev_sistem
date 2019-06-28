package jwd.ss.web.dto;

public class PlanetaDTO {
	
	private Long id;
	private String naziv;
	private Double udaljenostOdSunca;
	private Double vremeRotacije;
	private Double vremeRevolucije;
	private Integer precnik;
	private Integer brSatelita;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Double getUdaljenostOdSunca() {
		return udaljenostOdSunca;
	}
	public void setUdaljenostOdSunca(Double udaljenostOdSunca) {
		this.udaljenostOdSunca = udaljenostOdSunca;
	}
	public Double getVremeRotacije() {
		return vremeRotacije;
	}
	public void setVremeRotacije(Double vremeRotacije) {
		this.vremeRotacije = vremeRotacije;
	}
	public Double getVremeRevolucije() {
		return vremeRevolucije;
	}
	public void setVremeRevolucije(Double vremeRevolucije) {
		this.vremeRevolucije = vremeRevolucije;
	}
	public Integer getPrecnik() {
		return precnik;
	}
	public void setPrecnik(Integer precnik) {
		this.precnik = precnik;
	}
	public Integer getBrSatelita() {
		return brSatelita;
	}
	public void setBrSatelita(Integer brSatelita) {
		this.brSatelita = brSatelita;
	}

}
