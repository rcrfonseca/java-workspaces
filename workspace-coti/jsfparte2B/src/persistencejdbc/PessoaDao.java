package persistencejdbc;

import entity.*;
import java.util.*;
public class PessoaDao extends Dao{
	
	
	 public void create(Pessoa p)throws Exception{
      open();		 
	   stmt = con.prepareStatement("insert into pessoa values (null,?,?)");
	   stmt.setString(1,p.getNome());
	   stmt.setString(2, p.getSexo());
	   stmt.execute();
       stmt.close();

       stmt = con.prepareStatement("select max(idpessoa) as fkchave from pessoa");
       rs = stmt.executeQuery();
       rs.next();
       int chave = rs.getInt("fkchave");
       rs.close();
       stmt.close();

       stmt = con.prepareStatement("insert into endereco values (null,?,?,?,?)");
	   stmt.setString(1,p.getEndereco().getBairro());
	   stmt.setString(2,p.getEndereco().getCidade());
	   stmt.setString(3, p.getEndereco().getEstado());
	   stmt.setInt(4, chave); 
	   stmt.execute();
       stmt.close();
      close();
	 }
	 
	
	 
	 public List <Pessoa> findByAll() throws Exception{
		 open();
		 stmt = con.prepareStatement("select * from visao1");
		 rs = stmt.executeQuery();
		 List <Pessoa> resp = new ArrayList<Pessoa>();
		 while(rs.next()){
		  Pessoa p = new Pessoa(null,rs.getString("nome"),
				                     rs.getString("sexo")
		                          );
		  p.setEndereco(new Endereco(null, 
				        rs.getString("bairro"),
				        rs.getString("cidade"),
				        rs.getString("estado")
				  ));
		 
		  resp.add(p);	 
		 }
    	 close();
		 return resp;
	 }
	 
	 public static void main(String[] args) {
		
		 
		 try{
		  
			 PessoaDao pd = new PessoaDao();
			 
			 for (Pessoa p : pd.findByAll()){
	         System.out.println("Nome   ..." + p.getNome());			
	         System.out.println("Sexo   ..." + p.getSexo());
	         System.out.println("Bairro ..." + p.getEndereco().getBairro());
	         System.out.println("Cidade ..." + p.getEndereco().getCidade());
			 System.out.println("Estado ..." + p.getEndereco().getEstado());	 
			 }
			 
		 }catch(Exception e)
		 {
			System.out.println(e.getMessage()); 
		 }
		 
		 
	}
	 
	 

}
