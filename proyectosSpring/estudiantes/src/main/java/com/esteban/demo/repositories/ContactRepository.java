package com.esteban.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esteban.demo.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long>{
	List<Contact> findAll();
}