package persistencia;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dominio.Cliente;

public class ClienteDAO
	{
		private Session session;

		public ClienteDAO(Session session)
			{
				this.session = session;
			}

		public void incluir(Cliente Cliente)
			{
				Transaction transaction = session.beginTransaction();
				transaction.begin();
				session.save(Cliente);
				transaction.commit();
			}

		public Cliente obter(String cpf)
			{
				Query query = session
						.createQuery("from Cliente where cpf = :cpf ");
				query.setParameter("cpf", cpf);
				return (Cliente) query.uniqueResult();
			}

		public void alterar(Cliente Cliente)
			{
				Transaction transaction = session.beginTransaction();
				transaction.begin();
				session.saveOrUpdate(Cliente);
				transaction.commit();
			}

		public Cliente obter(Long id)
			{
				return (Cliente) session.load(Cliente.class, id);
			}

		public List<Cliente> listarTodos()
			{
				return session.createQuery("from Cliente").list();
			}

		public void remover(Cliente Cliente)
			{
				Transaction transaction = session.beginTransaction();
				transaction.begin();
				session.delete(Cliente);
				transaction.commit();
			}

	}