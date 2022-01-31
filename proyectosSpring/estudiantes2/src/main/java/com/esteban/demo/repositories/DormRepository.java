package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esteban.demo.models.Dorm;

@Repository
public interface DormRepository extends CrudRepository<Dorm, Long>{
	List<Dorm> findAll();
}