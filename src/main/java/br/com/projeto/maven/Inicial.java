package br.com.projeto.maven;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.maven.controller.ProdutoController;

@WebServlet(urlPatterns = "/home")
public class Inicial extends HttpServlet implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		ProdutoController prdCntrl = new ProdutoController();
	
		req.setAttribute("lista", prdCntrl);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/index.jsp");
		dispatcher.forward(req, resp);
		
		
	}
}
