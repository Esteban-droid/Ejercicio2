package com.service.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
    private static final long serialVersionUID = 1L;
    double result;

    public Calculator() {
        super();
    }

    protected void doGet(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {}

    protected void doPost(HttpServletRequest request,
        HttpServletResponse response) throws ServletException, IOException {

    	
        String valueString = request.getParameter("value");
        String resultString = request.getParameter("result");

        double result = 0;
        if (!resultString.isEmpty()) {
            result = Double.parseDouble(resultString);
        }

        if (!valueString.isEmpty()) {

            double value = Double.parseDouble(valueString);

            Map parameters = request.getParameterMap();
            if (parameters.containsKey("plus")) {
                result += value;
            } else if (parameters.containsKey("minus")) {
                result -= value;
            } else if (parameters.containsKey("divide")) {
                result /= value;
            } else if (parameters.containsKey("multiply")) {
                result *= value;
            }

            request.setAttribute("result", result);

            RequestDispatcher view = request.getRequestDispatcher("/Calc.jsp");
            view.forward(request, response);

        } else {

            RequestDispatcher view = request.getRequestDispatcher("/Calc.jsp");
            view.forward(request, response);
        }
    }
}