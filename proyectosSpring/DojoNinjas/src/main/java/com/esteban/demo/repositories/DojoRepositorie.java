package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esteban.demo.models.Dojo;

public interface DojoRepositorie extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
