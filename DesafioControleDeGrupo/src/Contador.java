import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());			
		}
		
	}
	static void contar(int paraUm, int paraDois ) throws ParametrosInvalidosException {
		if (paraUm < paraDois) {
			throw new ParametrosInvalidosException("O primeiro parametro tem que ser maior que o segundo.");
		}
		int interacoes = paraUm - paraDois;
		for (int num = 0; num < interacoes; num++) {
			System.out.println("Imprimimdo o número " + num);
		}
		
	}
}
