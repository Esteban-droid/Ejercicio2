package com.esteban.controladores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DojoController {

	public static void main(String[] args) {
		SpringApplication.run(CodingController.class, args);
	}
	
	@RequestMapping("/{text}")
	public String prueba(@PathVariable("text")String text) {
		if (text.equals("dojo")) {
			return "¡El Dojo es increíble!";
		}
		if (text.equals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		}
		
		if (text.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		
		return "";
	}
	

}
