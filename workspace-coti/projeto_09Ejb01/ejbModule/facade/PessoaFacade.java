package facade;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entity.Pessoa;

@Stateless /*Sem sessão. Stateful = Com sessão. */
public class PessoaFacade implements PessoaFacadeRemote {

	@PersistenceContext
	public EntityManager em; /* Não precisa do HibernateUtil. */
	
	
	public void create(Pessoa p) {
		em.persist(p); /* Para gravar Pessoa. Controle de transação automático. */
	}
	
	public void delete(Pessoa p) {
		em.remove(p); /* Para remover. */
	}
	
	public void update(Pessoa p) {
		em.merge(p); /* Altera Pessoa. */
	}

	@SuppressWarnings("unchecked")
	public List<Pessoa> findAll() {
		return em.createQuery("select p from Pessoa p").getResultList();
		/* HEJBQL. Seleciona o objeto p de Pessoa p. */
	}
	/* No EJB estou definindo a regra de negócio, que será aplicada no projeto. */

	public Pessoa findByCod(Integer cod) {
		return em.find(Pessoa.class, cod);
	}
}
