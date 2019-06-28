package jwd.ss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Satelit {
	
	@Id
	@GeneratedValue
	@Column
	private Long id;

	@Column
	private String naziv;

	@Column
	private Integer godinaOtkrica;

	@ManyToOne(fetch=FetchType.EAGER)
	private Planeta planeta;

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

	public Planeta getPlaneta() {
		return planeta;
	}

	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
		if(planeta!=null && !planeta.getSateliti().contains(this)){
			planeta.getSateliti().add(this);
		}
	}

}
