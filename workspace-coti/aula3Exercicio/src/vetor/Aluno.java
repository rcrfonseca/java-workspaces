package vetor;

public class Aluno {

	private String nome;
	private Double notas[];

	public Aluno(String nome, Double[] notas) {
		this.nome = nome;
		this.notas = notas;
	}

	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double[] getNotas() {
		return notas;
	}

	public void setNotas(Double[] notas) {
		this.notas = new Double[2];
		if (this.notas.length == notas.length) {
			this.notas = notas;
		} else
			this.notas = null;
	}

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Raphael");
		a.setNotas(new Double[] { 9., 8. });

		System.out.println("Aluno: " + a.getNome());
		System.out.println("Notas: " + a.getNotas()[0] + ", " + a.getNotas()[1]);
	}

}
