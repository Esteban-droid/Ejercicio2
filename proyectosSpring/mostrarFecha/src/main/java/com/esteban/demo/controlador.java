package com.esteban.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date mydate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEEEE, dd 'de' MMMMM, yyyy");//Sábado, 22 de Enero, 2028.
		String formattedDate = formatter.format(mydate);
		
		model.addAttribute("date", formattedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date mydate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a" );
		String formattedTime = formatter.format(mydate);
		model.addAttribute("date", formattedTime);
		return "time.jsp";
	}

}
