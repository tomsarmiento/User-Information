package com.tomassarmiento.simpleproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formulario
 */
@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		if(request.getParameter("nombre")!="" && request.getParameter("apellido")!="") {
			out.println("<h1>Bienvenido, "+ request.getParameter("nombre")+" "+request.getParameter("apellido")+"</h1>");
		}
		else if(request.getParameter("nombre")=="" && request.getParameter("apellido")!=""){
			out.println("<h1>Bienvenido, Unknown "+request.getParameter("apellido")+"</h1>");
		}
		else if(request.getParameter("nombre")!="" && request.getParameter("apellido")==""){
			out.println("<h1>Bienvenido, "+ request.getParameter("nombre")+" Unknown</h1>");
		}
		else {
			out.println("<h1>Bienvenido, Unknown Unknown</h1>");
		}
		out.println("<br>");
		out.println("<h2>Tu lenguaje favorito es: "+ request.getParameter("lenguajes")+"</h2>");
		out.println("<br>");
		if(request.getParameter("ciudad")!="") {
			out.println("<h2>Tu ciudad es: "+ request.getParameter("ciudad"));
		}
		else {
			out.println("<h2>Tu ciudad es: Unknown</h2>");
		}
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
