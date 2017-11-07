package vetor;

public class Aluno {

	private Integer idaluno;
	private String nome;
	private Double nota1;
	private Double nota2;
	private Double media;

	public Aluno(Integer idaluno, String nome, Double nota1, Double nota2,
			Double media) {

		this.idaluno = idaluno;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}

	public Aluno() {

	}

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
		this.media = (nota1 + nota2) / 2;
		return media;
	}

	public static void main(String[] args) {
		// vetor de Objeto.
		Aluno a[] = new Aluno[3];
		/* primeiro defino quantas posições do objeto (3 posições). */
		a[0] = new Aluno(1, "neto", 4., 3., null);
		// null é para média que não é inicializada.
		
		System.out.println(a[0].getNome() + ", " + a[0].getMedia());
		
		a[1] = new Aluno(2,"fernanda",9.,10.,null);
		
		System.out.println(a[1].getNome() + ", " + a[1].getMedia());
		
		a[2] = new Aluno(3,"kelly",8.,7.,null);
		
		System.out.println(a[2].getNome() + ", " + a[2].getMedia());

	}
}
