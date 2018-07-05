package br.com.projeto.maven.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	private static SessionFactory sessionFactory = null;

	public static Session openSession(String login, String senha) {
		Configuration config = new Configuration().configure(new HibernateUtil().getPath());
		config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost/projeto");
		config.setProperty("hibernate.connection.username", login);
		config.setProperty("hibernate.connection.password", senha);
		sessionFactory = config.buildSessionFactory();
		threadLocal.set(sessionFactory.openSession());
		return threadLocal.get();
	}

	public String getPath() {
		return getClass().getProtectionDomain().getCodeSource().getLocation().getPath() + "/hibernate.cfg.xml";

	}
}
