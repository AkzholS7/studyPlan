package com.javatechie.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
