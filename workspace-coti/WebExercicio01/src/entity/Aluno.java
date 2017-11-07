package entity;

public class Aluno {

	private Integer idaluno;
	private Double nota1;
	private Double nota2;

	public Aluno(Integer idaluno, Double nota1, Double nota2) {
		this.idaluno = idaluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public Aluno() {

	}

	public Integer getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(Integer idaluno) {
		this.idaluno = idaluno;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

}
