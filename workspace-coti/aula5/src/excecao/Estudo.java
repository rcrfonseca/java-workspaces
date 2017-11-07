package excecao;

public class Estudo {

	public static void main(String[] args) {
		Estudo e = new Estudo();
		// e.converter("a");
		// e.calcular(10);
		// e.vetor();

		try {
			e.divisao(10, 2);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		try {
			int num = e.exemplo("10");
			if (num >= 10){
				System.out.println(num);
			}else{
				throw new ErroAula ("Valor inválido.");
			}
			System.out.println(num);
		} catch (ErroAula ex) {
			System.out.println("Erro 1: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Erro 2: " + ex.getMessage());
		}
		/*
		 * Posso ter quantos catch() eu quiser, contando que seja do menor para
		 * o maior. ErroAula está abaixo de Exception.
		 */

	}

	public Estudo() {

	}

	public void converter(String valor) {

		try {
			int num = Integer.parseInt(valor);
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("Erro ao converter.");
			System.out.println("Motivo: " + e.getMessage());
		}
	}

	public void calcular(double valor) {
		try {
			if (valor >= 100) {
				System.out.println(valor * 2);
			} else {
				/* Redirecionar para o catch. */
				throw new Exception("Valor baixo para cálculo.");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			/* e.getMessage() vai trazer a msg definida no throw new Exeption(); */
		}
	}

	public void vetor() {
		String[] alunos = new String[4];

		try {
			alunos[0] = "Anny";
			alunos[1] = "Flanders";
			alunos[2] = "Lula";
			alunos[3] = "Luan";
			alunos[4] = "Martin"; // Erro, 5 posição.

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			for (String a : alunos) {
				System.out.println(a);
			}
		}
	}

	public void divisao(int a, int b) throws Exception {
		/*
		 * throws Exception me obriga a rodar o método com try catch se ele não
		 * estiver codificado.
		 */
		System.out.println(a / b);

	}

	public int exemplo(String valor) throws ErroAula {
		/* throws ErroAula porque ela é herança de Exception. */
		return new Integer(valor);
	}

}
