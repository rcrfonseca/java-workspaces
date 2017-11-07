package controle;

public class Aluno {

	private Integer idaluno;
	private String nome;
	private Double nota1;
	private Double nota2;
	private Double media;

	public Integer getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(Integer idaluno) {
		this.idaluno = idaluno;
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
		media = (nota1 + nota2) / 2;// alimentando o atributo.
		return media;
	}

	// media é um atributo de resultado total. Set() não é necessario, apenas
	// get().

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setIdaluno(1);
		a.setNome("Raphael");
		a.setNota1(9.);
		a.setNota2(7.);

		System.out.println("Nome: " + a.getNome());
		System.out.println("Média: " + a.getMedia());
	}

}
