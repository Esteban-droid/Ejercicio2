package com.esteban.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esteban.demo.models.Person;
import com.esteban.demo.repositories.PersonRepository;

@Service
public class PersonService {

	private final PersonRepository personRepo;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepo = personRepository;			
	}
	
	//Devolviendo todas las personas.
	public List<Person> allPersons(){
		return personRepo.findAll();
	}
	
	//Creando persona
	public Person createPerson(Person person) {
		return personRepo.save(person);
	}

	//Obteniendo la información de una persona
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepo.findById(id);
		if(optionalPerson.isPresent()) {
			System.out.println(optionalPerson.get());
			return optionalPerson.get();
		}else {
			return null;
		}
	}
}