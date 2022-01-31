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

import com.esteban.demo.models.Dojo;
import com.esteban.demo.models.Ninja;
import com.esteban.demo.services.archivoServices;

@Controller
public class mainController {
	
	private final archivoServices archivoServices;
	
	public mainController(archivoServices services) {
		this.archivoServices = services;
	}
	
	//Inicio
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";
	}

	//Creando dojo
	@RequestMapping(value="/dojos/create", method=RequestMethod.POST)
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			archivoServices.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
	//------------------------------------------------------------------------------------
	
	//Creando ninja
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = archivoServices.getDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}
	
	@RequestMapping(value="/ninjas/create", method=RequestMethod.POST)
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			archivoServices.createNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
	
	//------------------------------------------------------------------------------------
	
	//Mostrar dojo y sus ninjas
	@RequestMapping(value="dojos/{id}", method=RequestMethod.GET)
	public String showDojo(@PathVariable("id")Long id, Model model) {
		Dojo dojo = archivoServices.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojos.jsp";
	}
}
