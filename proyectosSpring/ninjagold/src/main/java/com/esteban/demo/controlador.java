package com.esteban.demo;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controlador {

	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("gold")== null) {
			session.setAttribute("gold", 0);
			
		}
			
		return "index.jsp";
	}
	@RequestMapping(value="/findgold", method=RequestMethod.POST)
	public String findGold(HttpSession session, @RequestParam(value="place") String place,Model model) {
		
		if(place.equals("farm")) {
			Integer randGold = getRandomGold(20,10);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+randGold);

		}else if (place.equals("cave")) {
			Integer randGold = getRandomGold(10,5);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+randGold);
			
		}else if (place.equals("house")) {
			Integer randGold = getRandomGold(5,2);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+randGold);

		}else if(place.equals("casino")) {
			Integer randGold = getRandomGold(50,-50);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+randGold);

		}	
		
		return "redirect:/";
	}
	
	
	//get random gold by calling this method 
	public int getRandomGold(int max, int min) {
		Random rand = new Random();
		int value = rand.nextInt((max-min)+1)+min;
		return value;
	}
}
