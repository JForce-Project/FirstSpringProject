package com.example.test1.servis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.model.Ogretmen;
import com.example.test1.repository.OgretmenRepository;
@Service
public class OgretmenService implements IOgretmenService{

	@Autowired
	OgretmenRepository ogretmenRepository;
	
	@Override
	public void save(Ogretmen ogretmen) {
		ogretmenRepository.save(ogretmen);
	}

	@Override
	public List<Ogretmen> getlist() {
		return ogretmenRepository.findAll();
	}

	@Override
	public Ogretmen findByOgretmenAdi(String ogretmenAdi) {
		return ogretmenRepository.ogretmenAdiBul(ogretmenAdi);
	}

}
