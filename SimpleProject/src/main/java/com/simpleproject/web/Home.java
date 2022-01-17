package com.simpleproject.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")

public class Home extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public Home() {
    	
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida=response.getWriter();
		
		//http://localhost:8080/SimpleProject/Home?nombre=Esteban&apellido=Mora...asi se pone mas parametros
		
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("lastname");
		String lenguaje = request.getParameter("languaje");
		String ciudad = request.getParameter("city");
		
		String unknown = "unknown";
		
		salida.println("<html><body>");
		
		if (nombre != null) {
			salida.println("Mi nombre: " + request.getParameter("name")); 
	        } else {
	        	salida.println("Mi nombre: " + unknown);
	        }
		
		salida.println("<br><br>");
		
		
		if (apellido != null) {
			salida.println("Mi apellido: " + request.getParameter("lastname")); 
	        } else {
	        	salida.println("Mi apellido: " + unknown); 
	        }
		
		salida.println("<br><br>");
		
		if (lenguaje != null) {
			salida.println("Lenguaje favorito: " + request.getParameter("languaje"));
	        } else {
	        	salida.println("Lenguaje favorito: " + unknown);
	        }
		
		salida.println("<br><br>");
		
		if (ciudad != null) {
			salida.println("Mi Ciudad: " + request.getParameter("city")); 
	        } else {	        	salida.println("Lenguaje favorito: " + unknown);
	        }
		
		salida.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
