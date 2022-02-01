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

import com.esteban.demo.models.Answer;
import com.esteban.demo.models.Question;
import com.esteban.demo.services.archivoServices;

@Controller
public class controller {
	
	private final archivoServices archivoServices;
	
	public controller(archivoServices services) {
		this.archivoServices = services;
	}
	
	//Inicio
	@RequestMapping("/")
	public String index() {
		return "redirect:/questions";
	}
	
	
	@RequestMapping("/questions")
	public String questions(Model model) {
		List<Question> questions = archivoServices.getAllQ();
		model.addAttribute("questions", questions);
		return "index.jsp";
	}
	
	//------------------------------------------------------------------------------------
	
	//Nueva question
	@RequestMapping("/questions/new")
	public String newQuestion(@ModelAttribute("addQuestion")Question question) {
		return "questions.jsp";
	}
	
	@RequestMapping(value="/questions/new", method=RequestMethod.POST)
	public String addQuestion(@Valid @ModelAttribute("addQuestion") Question question, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/questions/new";
		}else {
			archivoServices.createQuestion(question);
			return "redirect:/questions";
		}
	}
	
	//-------------------------------------------------------------------------------------
	
	//Detalle de question
	@RequestMapping(value="/questions/{id}", method=RequestMethod.GET)
	public String showQuestion(@PathVariable("id")Long id,@ModelAttribute("answer") Answer answer, Model model) {
		Question question = archivoServices.findQuestion(id);
		model.addAttribute("question", question);
		return "details.jsp";
	}
	
	//--------------------------------------------------------------------------------------
	
	//Crear answer
	@RequestMapping("/answer/new")
	public String newAnswer(@ModelAttribute("answer") Answer answer, Model model) {
		List<Question> questions = archivoServices.getAllQ();
		model.addAttribute("questios", questions);
		return "details.jsp";
	}
	
	@RequestMapping(value="/questions/addAnswer", method=RequestMethod.POST)
	public String addAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result) {
		if(result.hasErrors()) {
			return "details.jsp";
		}else {
			archivoServices.createAnswer(answer);
			return "redirect:/questions";
		}
	}
	
	//------------------------------------------------------------------------------------------
	
	
}


