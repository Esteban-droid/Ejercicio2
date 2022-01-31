package com.esteban.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.esteban.demo.models.Contact;
import com.esteban.demo.models.Student;
import com.esteban.demo.services.StudentService;

@Controller
public class controller {

	private final StudentService studentService;


	public controller(StudentService studentService) {
		this.studentService = studentService;
	}
	
	//Inicio
	@RequestMapping("/students")
	public String Index(Model model) {
		model.addAttribute("students", studentService.getStudents());
		return "index.jsp";
	}
	
	//Creando estudiante
	@RequestMapping("/students/new")
	public String newStudent(@ModelAttribute("student") Student student) {
		return "new.jsp";
	}
	
	@RequestMapping(value="/students/new", method=RequestMethod.POST)
	public String addNewPerson(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp"; 
		} else {
			
			studentService.createStudent(student);
			return "redirect:/students";
		}
	}
	
	//------------------------------------------------------------------------------------
	
	//Creando contacto
	@RequestMapping("/contacts/new")
	public String newContact(@ModelAttribute("contact") Contact contact, Model model) {
		List<Student> studs = studentService.getStudents();
		model.addAttribute("students", studs);
		return "contact.jsp";
	}

	@RequestMapping(value = "/contacts/new", method = RequestMethod.POST)
	public String createContact(@Valid @ModelAttribute("contact") Contact contact, BindingResult result) {
		if (result.hasErrors()) {
			return "redirect:/contacts/new";
		}else {
			studentService.createContact(contact);
			return "redirect:/students";
		}
	}
}