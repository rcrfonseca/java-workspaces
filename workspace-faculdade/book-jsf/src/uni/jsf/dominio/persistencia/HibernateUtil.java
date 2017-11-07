package uni.jsf.dominio.persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil
{

	//Objeto que constroi uma fábrica de sessões para 
	//ser utilizado nas transações sql
	private static SessionFactory	factory;

	//bloco que é inicializado quando a classe é chamada pela 
	//primeira vez e nunca mais é executado
	static
	{
		//cria um objeto na memória utilizando 
		//as configurações obtidas no 
		//hibernate.cfg.xml 
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.configure();
		factory = config.buildSessionFactory();
	}


	//método que retorna uma sessão de uso 
	//para aplicar o sql
	public static Session getSession()
	{
		return factory.openSession();
	}

}
