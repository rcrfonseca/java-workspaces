package entity;

public class Numero {

	private Integer idnumero;
	private Double valor;

	public Numero(Integer idnumero, Double valor) {

		this.idnumero = idnumero;
		this.valor = valor;
	}

	public Numero() {

	}

	public Integer getIdnumero() {
		return idnumero;
	}

	public void setIdnumero(Integer idnumero) {
		this.idnumero = idnumero;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
