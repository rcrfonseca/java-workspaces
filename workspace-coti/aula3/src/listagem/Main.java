package listagem;

public class Main {
	public static void main(String[] args) {
		Cliente c=new Cliente();
		c.setIdcliente(100);
		c.setNome("José");
		c.setSexo("M");
		
		//c é do Cliente
		ValidacaoCliente vc =new ValidacaoCliente();
		System.out.println(vc.isValidaNome(c.getNome()));
		//vc (objeto de ValidacaoCliente
		//vc.isValidaNome retorna true ou false
		System.out.println(vc.isValidaSexo(c.getSexo()));
		
	}

}
