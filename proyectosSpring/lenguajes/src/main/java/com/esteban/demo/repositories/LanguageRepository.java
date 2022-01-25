package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esteban.demo.models.Language;

@Repository // Assigns the interface as repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	
	@Override
	List<Language> findAll();
}
