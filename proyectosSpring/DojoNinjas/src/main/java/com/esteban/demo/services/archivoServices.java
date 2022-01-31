package com.esteban.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esteban.demo.models.Dojo;
import com.esteban.demo.models.Ninja;
import com.esteban.demo.repositories.DojoRepositorie;
import com.esteban.demo.repositories.NinjaRepositorie;

@Service
public class archivoServices {
	
	private DojoRepositorie dojoRepo;
	private NinjaRepositorie ninjaRepo;
	
	public archivoServices(DojoRepositorie dojoRepo, NinjaRepositorie ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}

	//Devolviendo todos los dojos.
	public List<Dojo> getDojos(){
		return dojoRepo.findAll();
	}
	
	//Devolciendo todos los ninjas
	public List<Ninja> getNinjas() {
		return ninjaRepo.findAll();
	}
	
	//Obteniendo la información de un dojo.
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()){
			return optionalDojo.get();
		}else {
			return null;
		}
	}
	
	//Obteniendo la información de un ninja
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
		if(optionalNinja.isPresent()){
			return optionalNinja.get();
		}else {
			return null;
		}
	}

	//Creando Dojo
	public void createDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	//Creando Ninja
	public void createNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
}
