package com.example;

import java.util.List;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityIntegrationTestApplication {

	@Autowired
	private StudentService service;

	@GetMapping("/getAllStudents")
	public List<Student> getStudents() {
		System.out.println("Controller getStudents() method called...");
		return service.findAllStudents();
	}

	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("Controller saveStudent() method called...");
		return service.saveStudent(student);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityIntegrationTestApplication.class, args);
	}

}
