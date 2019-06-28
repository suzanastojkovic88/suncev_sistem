package jwd.ss.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Planeta {
	
	@Id
	@Column
	@GeneratedValue
	private Long id;
	
	@Column
	private String naziv;
	
	@Column
	private Double udaljenostOdSunca;
	
	@Column
	private Double vremeRotacije;
	
	@Column
	private Double vremeRevolucije;
	
	@Column
	private Integer precnik;
	
	@Column
	private Integer brSatelita;
	
	@OneToMany(mappedBy="planeta",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Satelit> sateliti = new ArrayList<>();

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

	public List<Satelit> getSateliti() {
		return sateliti;
	}

	public void setSateliti(List<Satelit> sateliti) {
		this.sateliti = sateliti;
	}
	
	public void addSatelit(Satelit satelit) {
		this.sateliti.add(satelit);
		if(!this.equals(satelit.getPlaneta())) {
			satelit.setPlaneta(this);
			
		}
	}
	

}
