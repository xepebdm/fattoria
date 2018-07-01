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

@WebFilter(urlPatterns = "/*")
public class Filtro implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;

		System.out.println("Produto acessando a URI " + req.getRequestURI());

		chain.doFilter(request, response);
	}
		
	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}
}