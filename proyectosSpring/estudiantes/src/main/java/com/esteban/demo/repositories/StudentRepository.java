package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esteban.demo.models.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{
	List<Student> findAll();
}