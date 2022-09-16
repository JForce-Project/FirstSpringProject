package com.example.test1.model.dto;

public class DerslerRequest {

	private String DersAdi;
	private String DersSaati;
	private String ogretmenAdi;
	
	public String getDersAdi() {
		return DersAdi;
	}
	public String getDersSaati() {
		return DersSaati;
	}
	public String getOgretmenAdi() {
		return ogretmenAdi;
	}
	public void setDersAdi(String dersAdi) {
		DersAdi = dersAdi;
	}
	public void setDersSaati(String dersSaati) {
		DersSaati = dersSaati;
	}
	public void setOgretmenAdi(String ogretmenAdi) {
		this.ogretmenAdi = ogretmenAdi;
	}

	
}
