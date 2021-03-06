package com.helloworld.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

/**

 * Implementación del servlet de la clase Home

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

    	// Sets the content type of the response

        //response.setContentType("text/html");

        // writes the response

        //PrintWriter out = response.getWriter();

        //out.write("<h1>Hola Mundo</h1>");
    	
    	//--------------------------------------------
    	
    	// Obtener los valores para los parámetros de consulta

        String userName = request.getParameter("name");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.write("<h1>Hola Mundo, desde " + userName + "</h1>");

    }

    /**

     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO Auto-generated method stub

        doGet(request, response);

    }

}

