package candidatura;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		
		analizarCandidato(1900.00);
		analizarCandidato(1200.00);
		analizarCandidato(2300.00);
		analizarCandidato(2000.00);
	}

	static void analizarCandidato(double salarioPretendido) {
		double salarioBase = 2_000.00;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
