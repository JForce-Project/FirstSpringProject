package com.example.test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.test1.model.Dersler;

@Repository
public interface DerslerRepository extends JpaRepository<Dersler, Long> {

	@Query("select d from Dersler d where d.dersAdi=?1")
	//Query(value="select * from dersler where dersAdi=?1",nativeQuery=true)
	Dersler dersAdiBul(String dersAdi);

}
