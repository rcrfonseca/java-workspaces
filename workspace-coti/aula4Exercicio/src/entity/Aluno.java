package entity;

public class Aluno {

	private Integer idaluno;
	private String nome;
	private String sexo;

	public Aluno(Integer idaluno, String nome, String sexo) {
		this.idaluno = idaluno;
		this.nome = nome;
		this.sexo = sexo;
	}

	public Aluno() {

	}

	public void setIdaluno(Integer idaluno) {
		this.idaluno = idaluno;
	}

	public Integer getIdaluno() {
		return idaluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String toString() {
		return idaluno + ", " + nome + ", " + sexo;
	}

}
