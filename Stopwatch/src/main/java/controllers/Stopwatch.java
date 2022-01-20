package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import models.Timerr;

/**
 * Servlet implementation class Stopwatch
 */
@WebServlet("/Stopwatch")
public class Stopwatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static Date valor = new Date();
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	int contador=0;
	int total_contador=0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();	
		
		//String inicio = request.getParameter("inicio");
		//String detener = request.getParameter("detener");
		//String total = request.getParameter("total");
		
		//Date currentTime = new Date();
		//session.setAttribute("tiempo_actual", currentTime);
		
		
		
		//usar Timer

		//session.setAttribute("tiempo_actual", currentTime);
		
		//String hora=LocalDateTime.now().toString();

		//Timer timer = new Timer(1000, new ActionListener(){
	    //    @Override
	    //    public void actionPerformed(ActionEvent e) {
	    //    	session.setAttribute("hora", LocalDateTime.now());
	    //    	System.out.println(LocalDateTime.now());	        
	    //    }
	    //});
		

		//timer.start();
		
		String urlparam = request.getParameter("action");
		if(urlparam !=null) {
			if(urlparam.equals("reset")) {
				request.getSession().invalidate();
			}
		}
		
		if(urlparam !=null) {
			if(urlparam.equals("start")) {
					out.println("<h1>"+contador+"</h1>");
					out.println("<a href='/Stopwatch/stopwatch.jsp'>Stop</a>");
					contador++;
					total_contador=+contador;
					session.setAttribute("total", total_contador);
					response.setHeader("Refresh", "1");
			}else {
				request.getRequestDispatcher("stopwatch.jsp").forward(request, response);
			}
		}
		
		//if(contador>0) {
			//session.setAttribute("contador", contador);
		//	out.println("<h1>"+contador+"</h1>");
		//	--contador;
		//	response.setHeader("Refresh", "1");
		//}else {
		//	request.getRequestDispatcher("stopwatch.jsp").forward(request, response);
		//}
		
	}
	

	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
