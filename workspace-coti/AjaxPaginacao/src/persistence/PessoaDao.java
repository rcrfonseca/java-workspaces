package persistence;

import org.hibernate.*;
import java.util.*;
import entity.*;

public class PessoaDao {

	Session session;
	Criteria criteria;
	Transaction transaction;
	Query query;

	@SuppressWarnings("unchecked")
	public List<Pessoa> findByAll(String palavra) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("from Pessoa p where p.nome like :param");
		query.setString("param", palavra+"%");
		return query.list();
	} //Resgata pela palavra digitada.
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> findAll() throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("from Pessoa p");
		return query.list();
	} //Resgata tudo.

	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();
		try {
			for (Pessoa p : pd.findByAll("c")) {
				System.out.println(p);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}