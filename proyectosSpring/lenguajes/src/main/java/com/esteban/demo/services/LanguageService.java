package com.esteban.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esteban.demo.models.Language;
import com.esteban.demo.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	 //Agregando el lenguaje al repositorio como una dependencia
	private final LanguageRepository langRepo;
	
	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
	
	//Devolviendo todos los lenguajes.
	public List<Language> allLanguages(){
		return langRepo.findAll();
	}
	
	//Creando un lenguaje.
	public Language createLang(Language lang) {
		return langRepo.save(lang);
	}
	
	//Obteniendo la información de un lenguaje
	public Language findLang(Long id) {
		Optional<Language> optionalLang = langRepo.findById(id);
		if(optionalLang.isPresent()) {
			return optionalLang.get();
		} else {
			return null;
		}
	}
	
	//-------------------------------------------------------------------------------
	
	//Actualizando un lenguaje
	public Language updateLang(Long id, String name, String creator, String version) {
		Language language = findLang(id);
		if(language != null) {
			language.setName(name);
			language.setCreator(creator);;
			language.setVersion(version);
			langRepo.save(language);
			return language;
		} else {
			return null;
		}
	}
	
	//--------------------------------------------------------------------------------
	
	//Borrar lenguaje
	public void deleteLang(Long id) {
			langRepo.deleteById(id);
		
	}
	
	public void updateLang(Language lang) {
		langRepo.save(lang);
	}
}
