package com.javatechie.spring.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.api.entity.Student;
import com.javatechie.spring.api.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public Student saveStudent(Student person) {
		System.out.println("Service saveStudent() method Called...");
		return repository.save(person);
	}
	
	public List<Student> findAllStudents() {
		System.out.println("Service findAllStudents() method Called...");
		return repository.findAll();
	}

}
