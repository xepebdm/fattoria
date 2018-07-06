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
import br.com.projeto.maven.model.Produto;


@WebServlet(urlPatterns = "/editar")
public class EditarDados extends HttpServlet implements Serializable{

	private static final long serialVersionUID = 10L;	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		ProdutoController prdCntrl = new ProdutoController();	
		prdCntrl = (ProdutoController) session.getAttribute("produtos");		
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		if(id >= prdCntrl.getProdutos().size()) {
			req.getRequestDispatcher("/WEB-INF/error.jsp").forward(req, resp);;
			return;
		}
		
		Produto produto = prdCntrl.get(id);
		prdCntrl.edit(id, produto);
		
		req.setAttribute("id", id);
		req.setAttribute("produto", produto);
		
		req.setAttribute("lista", prdCntrl);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/editar.jsp");
		dispatcher.forward(req, resp);
		
	}
}
