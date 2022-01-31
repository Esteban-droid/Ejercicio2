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

import com.esteban.demo.models.Dorm;
import com.esteban.demo.models.Student;
import com.esteban.demo.services.archivoServicesss;

@Controller
public class controller {
	
	private final archivoServicesss archivoServices;
	
	public controller(archivoServicesss services) {
		this.archivoServices = services;
	}
	
	//Inicio
	@RequestMapping("/dorms/new")
	public String newDorm(@ModelAttribute("dorm") Dorm dorm) {
		return "index.jsp";
	}
	
	//Creando dormitorio
	@RequestMapping(value="/dorms/create", method=RequestMethod.POST)
	public String addDorm(@Valid @ModelAttribute("dorm") Dorm dorm, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			archivoServices.createDorm(dorm);
			return "redirect:/dorms/new";
		}
	}
	
	//-------------------------------------------------------------------------------
	
	//Creando estudiante
	@RequestMapping("/students/new")
	public String newStudent(@ModelAttribute("student") Student student, Model model) {
		List<Dorm> dorms = archivoServices.getDorms();
		model.addAttribute("dorms", dorms);
		return "index.jsp";
	}
	
	@RequestMapping(value="/students/create", method=RequestMethod.POST)
	public String addStudent(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}else {
			archivoServices.createStudent(student);
			return "redirect:/students/new";
		}
	}
	
	//-------------------------------------------------------------------------------
	
	//Mostrar dormitorios con sus estudiantes
	@RequestMapping(value="dorms/{id}", method=RequestMethod.GET)
	public String showDorm(@PathVariable("id")Long id, Model model) {
		Dorm dorm = archivoServices.findDorm(id);
		model.addAttribute("dorm", dorm);
		return "dorms.jsp";
	}
	
	//-------------------------------------------------------------------------------
	
	//Eliminar estudiante
	@RequestMapping(value="students/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		archivoServices.deleteStudent(id);
		return "redirect:/dashboard";
	}
	
	//--------------------------------------------------------------------------------
	
	@RequestMapping(value="/dorms/{id}/remove/{id2}", method=RequestMethod.DELETE)
	public String removeStudenttoDorm(@PathVariable("id") Long dormID, @PathVariable("id2") Long studentID, Model model) {
		Dorm updateddorm = archivoServices.removeStudentDorm(dormID, studentID);
		if (updateddorm == null) {
			return "redirect:/students";
		}
		return "redirect:/dorms/" + updateddorm.getId();
	}
}
