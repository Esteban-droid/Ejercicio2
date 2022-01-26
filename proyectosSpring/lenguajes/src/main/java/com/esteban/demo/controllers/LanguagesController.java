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
import org.springframework.web.bind.annotation.RequestParam;

import com.esteban.demo.models.Language;
import com.esteban.demo.services.LanguageService;

@Controller

public class LanguagesController {

	private final LanguageService langService;
	
	public LanguagesController(LanguageService langService) {
		this.langService = langService;
	}
	
	//mostrar lenguajes
	@RequestMapping(value="languages", method=RequestMethod.GET)
	public String index(Model model, @ModelAttribute("language")Language language) {
		List<Language> languages = langService.allLanguages();
		model.addAttribute("languages", languages);
		return "/languages/index.jsp";
	}
	
	//----------------------------------------------------------------------------

	//crear nuevo lenguage
	@RequestMapping("/languages")
    public String newBook(@ModelAttribute("language") Language language) {
        return "/languages/index.jsp";
    }
	
	@RequestMapping(value="languages", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/index.jsp";
		}else {
			langService.createLang(language);
			return "redirect:/languages";
		}
	}

	//-----------------------------------------------------------------------------
	
	//mostrar un libro especifico
	@RequestMapping(value="languages/{id}", method=RequestMethod.GET)
	public String show(@PathVariable("id") Long id, Model model) {
		Language language = langService.findLang(id);
		model.addAttribute("language", language);
		return "/languages/show.jsp";
	}
	
	//------------------------------------------------------------------------------
	
	//editar un lenguaje
	@RequestMapping(value="languages/{id}/edit", method=RequestMethod.GET)
	public String edit(@PathVariable("id") Long id, Model model) {
		Language language = langService.findLang(id);
		model.addAttribute("language", language);
		return "/languages/edit.jsp";
	}
	
	//-------------------------------------------------------------------------------
	
	//actualizar el lenguaje
	@RequestMapping(value="languages/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("language") Language language,BindingResult result) {		
		if (result.hasErrors()) {
			return "languages/edit.jsp";
		} else {
			langService.updateLang(language);
			return "redirect:/languages";
		}
	}
	
	//------------------------------------------------------------------------------

	//eliminar lenguaje
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String destory(@PathVariable("id") Long id) {
		langService.deleteLang(id);
		return "redirect:/languages";
	}

}
