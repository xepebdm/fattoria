package br.com.projeto.maven.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import br.com.projeto.maven.model.Produto;


/**
 * 
 * @author Alexsandre
 * 
 * A classe ainda está em contrução, não deve ser utilizada
 *
 */
//@Deprecated
public class TestaConexao {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("produto");
		EntityManager em = factory.createEntityManager();
		
//		Session sesion = HibernateUtil.openSession("root", "");		
	
		Produto produto = new Produto("Cafe", 4.0, 1, "10-05-2010");
		
		em.persist(produto);

		factory.close();

	}
}