package control;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import persistence.ClienteDao;
import entity.Cliente;

/* Managed Bean */
public class Manager {
	
	private Cliente cliente;
	private List<Cliente> clientes;

	public Manager() {
		cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public List<Cliente> getClientes() {
		try {
			clientes = new ClienteDao().listaGeral();
		} catch (Exception e) {
		}
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	private void addMsg(String msg, String idElemento){
		//Para trabalhar com JSF
		FacesContext ctx = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(msg);
		ctx.addMessage(idElemento, message);
	}
	
	public void salvar(){
		String msg = null;
		try {
			new ClienteDao().cadastrarCliente(cliente);
			msg = "Cliente cadastrado com sucesso!";			
		} catch (Exception e) {
			msg = e.getMessage();
		}finally{
			cliente = null; //Para limpar o formulário	
			addMsg(msg, null);
		}
	}
}