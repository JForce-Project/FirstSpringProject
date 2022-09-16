package com.example.test1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test1.model.Dersler;
import com.example.test1.model.Ogretmen;
import com.example.test1.model.Student;
import com.example.test1.model.dto.DerslerRequest;
import com.example.test1.model.dto.StudentRequest;
import com.example.test1.servis.IDerslerService;
import com.example.test1.servis.IOgretmenService;
import com.example.test1.servis.IStudentService;

@RestController
public class MyFirstService {

	@Autowired 
	IStudentService iStudentService;
	
	@Autowired
	IDerslerService iDerslerService;
	
	@Autowired 
	IOgretmenService iOgretmenService;
	
	@GetMapping("/getName")
	public String getName() {
		return "Ali";
	}
	@PostMapping(path="/toplama/{bir}/{iki}")
	public int top(@PathVariable("bir") int x,@PathVariable("iki") int y) {
		return x+y;
	}
	
	@PostMapping("/save")
	public void saveStudent(@RequestBody StudentRequest studentRequest) {
		
		Dersler ders=iDerslerService.findByDersAdi(studentRequest.getDersAdi());
		
		Student student=new Student();
		
		student.setName(studentRequest.getName());
		student.setSurname(studentRequest.getSurname());
		student.setDers(ders);

		iStudentService.save(student);
	}
	
	@GetMapping("/getList")
	public List<Student> getList() {
		return iStudentService.getlist();
	}
	
	
	@PostMapping("/saveDersler")
	public void saveDersler(@RequestBody DerslerRequest derslerRequest) {
		//Ogretmen ogretmen=iOgretmenService.findByogretmenAdi(derslerRequest.getOgretmenAdi());
		//Ogretmen ogretmenAdiBul
		
		Ogretmen ogretmen=iOgretmenService.findByOgretmenAdi(derslerRequest.getOgretmenAdi());
		
		Dersler dersler=new Dersler();
		dersler.setDersAdi(derslerRequest.getDersAdi());
		dersler.setDersSaati(derslerRequest.getDersSaati());
		dersler.setOgretmen(ogretmen);
		
		iDerslerService.save(dersler);
	}
	@GetMapping("/getListDersler")
	public List<Dersler> getList1(){
		return iDerslerService.getlist();
	}	
	@PostMapping("/saveOgretmen")
	public void saveOgretmen(@RequestBody Ogretmen ogretmen) {
		iOgretmenService.save(ogretmen);
	}
	@GetMapping("/getlistOgretmen")
	public List<Ogretmen> getList2(){
		return iOgretmenService.getlist();
	}
	
	@PostMapping("/updateStudentName")
	public void updateStudentName(@RequestParam("Id")int Id,@RequestParam("name")String name) {
		Student student=iStudentService.findById(Id);
		student.setName(name);
		iStudentService.save(student);
		
	}
	
	
}
