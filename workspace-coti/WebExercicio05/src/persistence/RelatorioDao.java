package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Login;

public class RelatorioDao {
	
	Session session;
	Query query;
	Transaction transaction;
	ResultSet rs;
	Connection con;
	PreparedStatement stmt;
	
	public ResultSet getConsultaLogin(Login lo) throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		query = session.createQuery("from Login lo");
		rs = (ResultSet) query;
		return rs;
	}
}