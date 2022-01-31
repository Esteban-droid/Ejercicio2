package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.esteban.demo.models.Ninja;

public interface NinjaRepositorie extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
}