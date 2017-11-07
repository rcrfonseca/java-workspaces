package persistence;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import entity.Endereco;

public class EnderecoDao {

	Session session;
	Query query;
	Criteria criteria;
	Transaction transaction;

	public void create(Endereco endereco) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(endereco);
		transaction.commit();
		session.close();
	}
}
