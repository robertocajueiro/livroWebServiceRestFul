package br.com.livro.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");
		
		resp.getWriter().print("Ola mundo " + nome + " " + sobrenome);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");
		
		resp.getWriter().print("Ola mundo POST " + nome + " " + sobrenome);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		resp.getWriter().print("Ola PUT");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException,IOException {
		resp.getWriter().print("Ola DELETE");
	}

}
