package controle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import persistencia.HibernateUtil;
import persistencia.UsuarioDAO;
import dominio.Usuario;

public class LoginMB
	{
		private Usuario usuario = new Usuario();
		private UsuarioDAO dao = new UsuarioDAO(HibernateUtil.getSession());

		public String logar()
			{
				Usuario usuarioDoBanco = this.dao.obter(this.getUsuario()
						.getLogin());
				if (usuarioDoBanco == null)
					{
						FacesContext contexto = FacesContext
								.getCurrentInstance();
						contexto.addMessage("erroLogin", new FacesMessage(
								"O usu�rio n�o existe."));
						return "falha";
					} else if (usuarioDoBanco.validarSenha(this.getUsuario()
						.getSenha()))
					{
						FacesContext contexto = FacesContext
								.getCurrentInstance();
						SessaoMB sessao = (SessaoMB) contexto.getApplication()
								.createValueBinding("#{sessaoMB}").getValue(
										contexto);
						// armazena o usu�rio na sess�o
						sessao.setUsuario(usuarioDoBanco);

						return "sucesso";
					} else
					{
						FacesContext contexto = FacesContext
								.getCurrentInstance();
						contexto.addMessage("erroLogin", new FacesMessage(
								"Senha inv�lida."));
						return "falha";
					}
			}

		public String logoff()
			{
				FacesContext contexto = FacesContext.getCurrentInstance();
				SessaoMB sessao = (SessaoMB) contexto.getApplication()
						.createValueBinding("#{sessaoMB}").getValue(contexto);
				// armazena o usu�rio na sess�o
				sessao.setUsuario(new Usuario());

				return "login";
			}

		public Usuario getUsuario()
			{
				return usuario;
			}

		public void setUsuario(Usuario usuario)
			{
				this.usuario = usuario;
			}

	}
