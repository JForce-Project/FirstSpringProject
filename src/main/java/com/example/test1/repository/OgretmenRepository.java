package com.example.test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.test1.model.Ogretmen;

@Repository
public interface OgretmenRepository extends JpaRepository <Ogretmen, Long>{
	
	@Query("select d from Ogretmen d where d.ogretmenAdi=?1")
	Ogretmen ogretmenAdiBul(String ogretmenAdi);
	
}
