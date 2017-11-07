package persistence;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Pessoa;

public class PessoaDao {
	
	Session session;
	Transaction transaction;
	Query query;
	Criteria criteria;
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> findByAll() throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		return session.createQuery("from Pessoa p").list();
	}
	
	public void create(Pessoa p) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(p);
		transaction.commit();
		session.close();
	}
}