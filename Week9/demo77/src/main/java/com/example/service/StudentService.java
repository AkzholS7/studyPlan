package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

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
