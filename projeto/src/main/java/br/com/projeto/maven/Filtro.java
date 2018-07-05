package br.com.projeto.maven;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.projeto.maven.controller.ProdutoController;

@WebFilter(urlPatterns = "/*")
public class Filtro implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;

		HttpSession session = req.getSession();
		
		ProdutoController prdCntrl = new ProdutoController();	
		prdCntrl = (ProdutoController) session.getAttribute("produtos");
		
		session.invalidate();
		
		HttpSession session2 = req.getSession(true);		
		session2.setAttribute("produtos", prdCntrl);
		
		req.setAttribute("lista", prdCntrl);		
		
		chain.doFilter(request, response);
	}
		
	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}
}