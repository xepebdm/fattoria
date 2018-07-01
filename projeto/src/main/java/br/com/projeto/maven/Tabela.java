package br.com.projeto.maven;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.projeto.maven.controller.ProdutoController;

@WebServlet(urlPatterns = "/tabela")
public class Tabela extends HttpServlet implements Serializable{

	private static final long serialVersionUID = 3L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session = req.getSession();
		ProdutoController prdCntrl = new ProdutoController();	
		prdCntrl = (ProdutoController) session.getAttribute("produtos");
		
//		prdCntrl = (ProdutoController) req.getAttribute("lista");
		
		
		req.setAttribute("lista", prdCntrl);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/tabela.jsp");
		dispatcher.forward(req, resp);
	}

}
