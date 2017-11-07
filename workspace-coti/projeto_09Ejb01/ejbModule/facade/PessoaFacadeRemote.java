package facade;

import java.util.List;

import javax.ejb.Remote;

import entity.Pessoa;

@Remote /* Para trabalhar com interface remotamente, usando em outras máquinas. Se fosse local, seria Local,
inclusive o nome da interface seria PessoaFacadeLocal. */
public interface PessoaFacadeRemote {
	
	public void create(Pessoa p);
	public void update(Pessoa p);
	public void delete(Pessoa p);
	public List <Pessoa> findAll();
	public Pessoa findByCod(Integer cod);
	

}
