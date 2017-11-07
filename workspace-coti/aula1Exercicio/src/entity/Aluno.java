package entity;

public class Aluno {
	private Integer matricula;
	private String nome;
	private Double nota1;
	private Double nota2;
	private Double media;

	public Aluno(Integer matricula, String nome, Double nota1, Double nota2,
			Double media) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}

	public Aluno() {

	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Double getMedia() {
		return (nota1 + nota2) / 2;
	}

	public String toString() {
		return "Nota 1: " + nota1 + ", " + "Nota 2: " + nota2 + ", "
				+ "Média: " + media;
	}

	public int hashCode() {
		return matricula;
	}

	public boolean equals(Object obj) {
		return ((Aluno) obj).getMatricula().equals(this.matricula);
	}

	public static void main(String[] args) {
		Aluno a = new Aluno();

		a.setNome("Raphael");
		a.setMatricula(5304295);
		a.setNota1(8.);
		a.setNota2(9.);

		Aluno a2 = new Aluno(5304295, "Carlos", 8., 7., 7.5);

		System.out.println("Aluno 1: " + a.getNome());
		System.out.println("Matrícula: " + a.hashCode());
		System.out.println("Nota 1: " + a.getNota1());
		System.out.println("Nota 2:" + a.getNota2());
		System.out.println("Média: " + a.getMedia());
		System.out.println("-------------------------");
		System.out.println("Aluno 2: " + a2.toString());
		System.out.println("Matrículas iguais? " + a.equals(a2));

	}
}
