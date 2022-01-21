package com.esteban.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class controlador {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/getcode", method=RequestMethod.POST)
	public String getcode(@RequestParam(value="textinput") String userInput) {
		String result ="";
		if(userInput.equals("bushido")) {
			result= "redirect:/code";
		}else {
			result = "redirect:/createError";
		}
		return result;
	}
	@RequestMapping("/code")
	public String displaycode(){
		return "code.jsp";
	}
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttrbutes) {
		redirectAttrbutes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
}