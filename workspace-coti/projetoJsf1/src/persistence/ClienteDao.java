package persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Cliente;

public class ClienteDao {

	Session s;
	Transaction t;

	public void cadastrarCliente(Cliente c) throws Exception {
		s = HibernateUtil.getSessionFactory().openSession();
		t = s.beginTransaction();
		s.save(c);
		t.commit();
		s.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> listaGeral() throws Exception{
		s = HibernateUtil.getSessionFactory().openSession();
		/* createCriteria = retornar consulta usando direto a classe */
		List<Cliente> lista = s.createCriteria(Cliente.class).list();
		return lista;
	}

}