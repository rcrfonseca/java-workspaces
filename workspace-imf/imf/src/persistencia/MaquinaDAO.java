package persistencia;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dominio.Maquina;

public class MaquinaDAO
	{
		private Session session;

		public MaquinaDAO(Session session)
			{
				this.session = session;
			}

		public void incluir(Maquina Maquina)
			{
				Transaction transaction = session.beginTransaction();
				transaction.begin();
				session.save(Maquina);
				transaction.commit();
			}

		public Maquina obter(String nome)
			{
				Query query = session
						.createQuery("from Maquina where nome = :nome ");
				query.setParameter("nome", nome);
				return (Maquina) query.uniqueResult();
			}

		public void alterar(Maquina Maquina)
			{
				Transaction transaction = session.beginTransaction();
				transaction.begin();
				session.saveOrUpdate(Maquina);
				transaction.commit();
			}

		public Maquina obter(Long id)
			{
				return (Maquina) session.load(Maquina.class, id);
			}

		public List<Maquina> listarTodos()
			{
				return session.createQuery("from Maquina").list();
			}

		public void remover(Maquina Maquina)
			{
				Transaction transaction = session.beginTransaction();
				transaction.begin();
				session.delete(Maquina);
				transaction.commit();
			}

	}