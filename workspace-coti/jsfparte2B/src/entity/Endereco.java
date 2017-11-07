package entity;

public class Endereco {

	private  Integer idendereco;
	private  String  bairro;
	private String cidade;
	private String estado;

	public Endereco(Integer idendereco,String bairro, String cidade, String estado)
			{
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.idendereco = idendereco;
	}

	
	public Endereco() {
	}

    public String toString(){
    	return idendereco + "," + bairro + "," + cidade + "," + estado;
    }
    
	public Integer getIdendereco() {
		return idendereco;
	}

	public void setIdendereco(Integer idendereco) {
		this.idendereco = idendereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
