package polimorfismo;

public class Main {

	public static void main(String[] args) {
		FuncionarioPj pj = new FuncionarioPj();
		pj.setNome("Carlos");
		pj.setSalarioBase(600.);

		FuncionarioClt clt = new FuncionarioClt();
		clt.setNome("Raphael");
		clt.setTempoTrabalho(2);
		clt.setSalarioBase(2000.);
		

		System.out.println("Cálculo do salário do mês de Dezembro:");
		System.out.println("PJ: " + pj.getNome() + ", " + pj.salarioTotal());
		System.out.println("CLT: " + clt.getNome() + ", " + clt.salarioTotal());

	}
}
