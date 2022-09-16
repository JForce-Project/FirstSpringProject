package com.example.test1.servis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.model.Dersler;
import com.example.test1.model.Ogretmen;
import com.example.test1.repository.DerslerRepository;
import com.example.test1.repository.OgretmenRepository;

@Service
public class DerslerService implements IDerslerService{
	@Autowired
	DerslerRepository derslerRepository;
	
	@Autowired
	OgretmenRepository ogretmenRepository;
	
	@Override
	public void save(Dersler dersler) {
	 derslerRepository.save(dersler);
		
	}

	@Override
	public List<Dersler> getlist() {
		return derslerRepository.findAll();
	}

	@Override
	public Dersler findByDersAdi(String dersAdi) {
		
		return derslerRepository.dersAdiBul(dersAdi);
	}

	
}



