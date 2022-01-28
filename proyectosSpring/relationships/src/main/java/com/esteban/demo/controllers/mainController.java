package com.esteban.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esteban.demo.models.License;
import com.esteban.demo.models.Person;
import com.esteban.demo.services.LicenseService;
import com.esteban.demo.services.PersonService;

@Controller
public class mainController {
	
	private final PersonService personService;
	
	private final LicenseService licenseService;
	
	public mainController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	//inicio
	@RequestMapping("/")
	public String index() {
		return "redirect:/person/new";
	}

	//-------------------------------------------------------------------------
	
	//Creando persona
	@RequestMapping("/person/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/create/person", method = RequestMethod.POST)
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {

			personService.createPerson(person);
			return "redirect:/person/new";
		}
	}
	
	//----------------------------------------------------------------------------------------
	
	//Creando licencia
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute("license")License license, Model model) {
		List<Person> listPerson = personService.allPersons();
		model.addAttribute("persons", listPerson);
		return "license.jsp";
	}
	
	@RequestMapping(value="/licenses/create", method=RequestMethod.POST)
	public String createLicense(@Valid @ModelAttribute("license")License license, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/licenses/new";
		}else {
			licenseService.createLicense(license);
			return "redirect:/";
		}
		
	}
	
	//--------------------------------------------------------------------------------------
	
	//Mostrar persona y su licencia
	@RequestMapping(value="person/{id}", method=RequestMethod.GET)
	public String show(@PathVariable("id")Long id, Model model) {
		Person person = personService.findPerson(id);
		model.addAttribute("person", person);
		return "result.jsp";
		}
}