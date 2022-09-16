package com.example.test1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ogretmen")
public class Ogretmen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="ogretmenAdi")
	private String ogretmenAdi;

	public int getId() {
		return id;
	}

	public String getOgretmenAdi() {
		return ogretmenAdi;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOgretmenAdi(String ogretmenAdi) {
		this.ogretmenAdi = ogretmenAdi;
	}

	
}
