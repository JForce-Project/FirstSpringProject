package com.example.test1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dersler")
public class Dersler {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="dersAdi")
	private String dersAdi;
	
	@Column(name="dersSaati")
	private String dersSaati;
	
	@ManyToOne
	@JoinColumn(name="ogretmen")
	private Ogretmen ogretmen;

	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

	public int getId() {
		return id;
	}

	public String getDersAdi() {
		return dersAdi;
	}

	public String getDersSaati() {
		return dersSaati;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	public void setDersSaati(String dersSaati) {
		this.dersSaati = dersSaati;
	}
	

}
