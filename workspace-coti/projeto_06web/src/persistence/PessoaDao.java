package persistence;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import entity.Pessoa;

public class PessoaDao {

	Session session;
	Query query;
	Criteria criteria;
	Transaction transaction;

	public void create(Pessoa pessoa) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(pessoa);
		transaction.commit();
		session.close();
	}
}