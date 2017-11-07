package controle;

import java.util.List;

import javax.faces.context.FacesContext;

import persistencia.ClienteDAO;
import persistencia.HibernateUtil;
import dominio.Cliente;

public class ClienteMB
	{
		private Cliente Cliente = new Cliente();
		private ClienteDAO dao = new ClienteDAO(HibernateUtil.getSession());

		public String abrirAlteracao()
			{
				FacesContext contexto = FacesContext.getCurrentInstance();
				String id = contexto.getExternalContext()
						.getRequestParameterMap().get("id");

				this.Cliente = this.dao.obter(Long.parseLong(id));

				return "editarCliente";
			}

		public String excluir()
			{
				FacesContext contexto = FacesContext.getCurrentInstance();
				String id = contexto.getExternalContext()
						.getRequestParameterMap().get("id");

				this.Cliente = this.dao.obter(Long.parseLong(id));
				this.dao.remover(this.Cliente);

				return "listar";
			}

		public String cancelar()
			{
				FacesContext contexto = FacesContext.getCurrentInstance();
				SessaoMB sessao = (SessaoMB) contexto.getApplication()
						.createValueBinding("#{sessaoMB}").getValue(contexto);

				if (sessao.getUsuario().getId() == null)
					return "login";
				else
					return "listar";
			}

		public String salvar()
			{
				if (this.getCliente().getId() == 0)
					this.getCliente().setId(null);

				this.dao.alterar(this.getCliente());
				return "listar";

			}

		public Cliente getCliente()
			{
				return Cliente;
			}

		public void setCliente(Cliente usuario)
			{
				this.Cliente = usuario;
			}

		public List<Cliente> getClientes()
			{
				return this.dao.listarTodos();
			}

		public Integer getNumeroClientes()
			{
				return getClientes().size();
			}
	}
