package com.example.test1.servis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.model.Student;
import com.example.test1.repository.StudentRepository;

@Service
public class StudentService implements IStudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> getlist() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int Id) {
		
		return studentRepository.findById(Id);
	}
	
	

}
