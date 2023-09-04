package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		
		selecaoCandidatos();
	}
	
	static void selecaoCandidatos() {
		String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", 
								"PAULO", "AUGUSTO", "MÔNICA", 
								"FABRÍCIO", "MIRELA","DANIELA", 
								"JORGE" };
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2_000.00;
		
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String canditato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.printf("O candidato %s solicitou esse valor de salário %2f", canditato, salarioPretendido);
			System.out.println();
			if (salarioBase >= salarioPretendido) {
				System.out.printf("O candidato %s foi selecionado para a vaga", canditato);
				System.out.println();
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
