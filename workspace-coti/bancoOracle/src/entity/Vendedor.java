package entity;

public class Vendedor {

	private Integer idvendedor;
	private String vendedor;
	private String mes;
	private Integer ano;
	private Double preco;

	public Vendedor(Integer idvendedor, String vendedor, String mes,
			Integer ano, Double preco) {
		this.idvendedor = idvendedor;
		this.vendedor = vendedor;
		this.mes = mes;
		this.ano = ano;
		this.preco = preco;
	}

	public Vendedor() {
	}

	public String toString() {
		return idvendedor + ", " + vendedor + ", " + mes + ", " + ano;
	}

	public Integer getIdvendedor() {
		return idvendedor;
	}

	public void setIdvendedor(Integer idvendedor) {
		this.idvendedor = idvendedor;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}