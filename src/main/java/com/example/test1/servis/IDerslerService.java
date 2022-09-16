package com.example.test1.servis;

import java.util.List;

import com.example.test1.model.Dersler;
import com.example.test1.model.Ogretmen;

public interface IDerslerService {
	void save(Dersler dersler);
	List<Dersler> getlist();
	Dersler findByDersAdi(String dersAdi);
}


