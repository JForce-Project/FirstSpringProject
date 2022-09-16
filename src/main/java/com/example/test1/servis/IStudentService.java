package com.example.test1.servis;

import java.util.List;

import com.example.test1.model.Student;

public interface IStudentService {
	void save(Student student);
	List<Student> getlist();
	
	
	Student findById(int Id);
	
}
