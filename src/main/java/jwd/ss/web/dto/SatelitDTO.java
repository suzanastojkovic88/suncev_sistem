package jwd.ss.web.dto;

public class SatelitDTO {
	
	private Long id;
	private String naziv;
	private Integer godinaOtkrica;
	private Long planetaId;
	private String planetaNaziv;
	
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
	public Integer getGodinaOtkrica() {
		return godinaOtkrica;
	}
	public void setGodinaOtkrica(Integer godinaOtkrica) {
		this.godinaOtkrica = godinaOtkrica;
	}
	public Long getPlanetaId() {
		return planetaId;
	}
	public void setPlanetaId(Long planetaId) {
		this.planetaId = planetaId;
	}
	public String getPlanetaNaziv() {
		return planetaNaziv;
	}
	public void setPlanetaNaziv(String planetaNaziv) {
		this.planetaNaziv = planetaNaziv;
	}

}
