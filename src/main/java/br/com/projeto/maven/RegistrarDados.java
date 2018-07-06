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


@WebServlet(urlPatterns="/adiciona")
public class RegistrarDados extends HttpServlet implements Serializable{

	private static final long serialVersionUID = 1L;	
	private ProdutoController prdCntrl = new ProdutoController();		
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
				
//		prdCntrl = (ProdutoController) req.getAttribute("lista");
		String nome = req.getParameter("nome");
		double preco = Double.parseDouble(req.getParameter("preco"));
		int quantidade = Integer.parseInt(req.getParameter("qtd"));
		String dataDeCadastro = req.getParameter("dataDeCadastro");
		
		Produto produto = new Produto(nome, preco, quantidade, dataDeCadastro);
		
		prdCntrl.put(produto);
		
		session.setAttribute("produtos", prdCntrl);
		
		req.setAttribute("lista", prdCntrl);		
					
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/tabela.jsp");
		dispatcher.forward(req, resp);		
	}
}