package controle;

import java.util.List;

import javax.faces.context.FacesContext;

import persistencia.HibernateUtil;
import persistencia.MaquinaDAO;
import dominio.Maquina;


public class MaquinaMB
	{
		private Maquina Maquina = new Maquina();
		private MaquinaDAO dao = new MaquinaDAO(HibernateUtil.getSession());

		public String abrirAlteracao()
			{
				FacesContext contexto = FacesContext.getCurrentInstance();
				String id = contexto.getExternalContext()
						.getRequestParameterMap().get("id");

				this.Maquina = this.dao.obter(Long.parseLong(id));

				return "editarMaquina";
			}

		public String excluir()
			{
				FacesContext contexto = FacesContext.getCurrentInstance();
				String id = contexto.getExternalContext()
						.getRequestParameterMap().get("id");

				this.Maquina = this.dao.obter(Long.parseLong(id));
				this.dao.remover(this.Maquina);

				return "listar";
			}

		public String salvar()
			{
				if (this.getMaquina().getId() == 0)
					this.getMaquina().setId(null);

				this.dao.alterar(this.getMaquina());
				return "listar";

			}

		public Maquina getMaquina()
			{
				return Maquina;
			}

		public void setMaquina(Maquina usuario)
			{
				this.Maquina = usuario;
			}

		public List<Maquina> getMaquinas()
			{
				return this.dao.listarTodos();
			}

		public Integer getNumeroMaquinas()
			{
				return getMaquinas().size();
			}
	}
