package entity;

//trabalhando com vetor
public class Aluno {
	private Integer idaluno;
	private String nome;
	private String materia;
	private Double notas[]; // vetor declarado desta forma, tem tamanho
							// indefinido.

	// vetor

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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Double[] getNotas() {
		return notas;
	}

	// retorna o posicionamento da aula

	public void setNotas(Double[] notas) {
		this.notas = notas;
	}

	// set do vetor

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setIdaluno(10);
		a.setNome("Luan Santana");
		a.setMateria("Oracle");
		a.setNotas(new Double[] { 1., 2., 0. });

		Double media = 0.0;
		media = (a.getNotas()[0] + a.getNotas()[1] + a.getNotas()[2]) / 3;
		// Media foi criada no main, logo é uma variável. Se tivesse sido
		// declarada no começo da classe, seria um atributo.
		
		// [0] representa a primeira posição do vetor
		
		System.out.println("Nome " + a.getNome());
		System.out.println("Materia " + a.getMateria());
		System.out.println("Média " + media);

	}

}
