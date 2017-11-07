package persistence;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

public class HibernateUtil {
	/* Criar a Session Factory: Permite criar as tabelas no BD. */
	
	private static final SessionFactory sessionFactory;
	/* Por ser estático, já está alocado na memória. */

	static {
		try {
			
			sessionFactory = new AnnotationConfiguration().configure(
					"cfg/mysql_hibernate.cfg.xml").buildSessionFactory();
			/* Caminho do arquivo de configuração. */
			
		} catch (Throwable ex) {
			
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
			
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
		
		/* Abre a sessão apenas uma vez por ser estático. */
	}
	
}