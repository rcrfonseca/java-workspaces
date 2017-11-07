package persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Login;

public class LoginDao {
	
	Session session;
	Criteria criteria;
	Transaction transaction;
	Query query;
	
	public void create(Login lo) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.save(lo);
		transaction.commit();
		session.close();
	}
	
	public void update(Login lo) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.update(lo);
		transaction.commit();
		session.close();
	}
	
	public void delete(Login lo) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.delete(lo);
		transaction.commit();
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public List <Login> findAll(Login lo) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		return session.createQuery("from Login lo").list();
	}
	
	public boolean isLogin(Login lo) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("from Login l where l.login = :p1 and l.senha = :p2");
		query.setString("p1", lo.getLogin());
		query.setString("p2", lo.getSenha());
		
		Login login = (Login) query.uniqueResult();
		
		boolean resp = false;
		if(login != null)
			resp = true;
		return resp;
	}
	

}
