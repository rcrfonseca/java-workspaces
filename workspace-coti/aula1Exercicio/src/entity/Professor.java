package entity;

public class Professor {
	private String nome;
	private Integer matricula;

	public Professor(String nome, Integer matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public Professor() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String toString() {
		return "Matrícula: " + matricula + ", " + "Nome: " + nome;
	}

	public int hashCode() {
		return matricula;
	}

	public boolean equals(Object obj) {
		return ((Professor) obj).getMatricula().equals(this.matricula);
	}

	public static void main(String[] args) {
		Professor p = new Professor("Luiz", 4578);

		Professor p2 = new Professor("Carlos", 4578);

		System.out.println(p.toString());
		System.out.println("Matrículas iguais? " + p.equals(p2));
	}

}
