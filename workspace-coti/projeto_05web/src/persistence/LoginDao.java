package persistence;

import org.hibernate.*;
/* API para as classes HIBERNATE.*/
import entity.*;
import java.util.*; //Para uma LIST.

public class LoginDao {
	
	Session session;
	Criteria criteria;
	Query query;
	Transaction transaction;
	
	public void create(Login log) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();//inicia a transaction.
		session.save(log);//salva o objeto log.
		transaction.commit();//grava a transação.		
		session.close();//fecho a sessão.
	}
	
	public void update(Login log) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();//inicia a transaction.
		session.update(log);//altera o objeto log.
		transaction.commit();//grava a transação.		
		session.close();//fecho a sessão.
	}
	
	public void delete(Login log) throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();//inicia a transaction.
		session.delete(log);//deleta o objeto log.
		transaction.commit();//grava a transação.		
		session.close();//fecho a sessão.
	}
	
	@SuppressWarnings("unchecked")
	public List<Login> findAll() throws Exception {
		session = HibernateUtil.getSessionFactory().openSession();
		return session.createQuery("from Login lo").list();
		/* from Login lo: from Classe objeto */
	}/* Abre a sessão, Classe login vira objeto lo, e lista tudo que está armazenado. */
	
	public boolean isLogin(Login lo) throws Exception {
		
		session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("from Login l where l.usuario= :p1 and l.senha= :p2");
		query.setString("p1", lo.getUsuario());
		query.setString("p2", lo.getSenha());
		
		Login login = (Login) query.uniqueResult();
		
		boolean resp = false;
		if(login != null){
			resp = true;
		}
		return resp;
	}
	
	public static void main(String[] args) {
		
		Login lo = new Login(null, "raphael", "123");
		
		LoginDao ld = new LoginDao();
		
		try {
			boolean resp = ld.isLogin(lo);
			System.out.println("Autorização: " + resp);
		} catch (Exception e) {
		}
	}
	

}
