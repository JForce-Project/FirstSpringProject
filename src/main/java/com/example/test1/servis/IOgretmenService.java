package com.example.test1.servis;

import java.util.List;

import com.example.test1.model.Ogretmen;

public interface IOgretmenService {
	void save(Ogretmen ogretmen);
	List<Ogretmen> getlist();
	Ogretmen findByOgretmenAdi(String ogretmenAdi);
}
