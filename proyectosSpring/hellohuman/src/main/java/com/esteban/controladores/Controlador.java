package com.esteban.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	@RequestMapping("/")
	public String inicio(@RequestParam(value="name", required=false) String name, String lastname) {
		if(name==null) {
			return "Hello Human! Welcome to Springboot";
		}else {
			return "Hello " + name + " " + lastname + " Welcome to Springboot";
		}
		
	}

}
