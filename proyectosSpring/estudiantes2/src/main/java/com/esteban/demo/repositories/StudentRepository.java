package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esteban.demo.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	List<Student> findAll();
}
