package aplicacao;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira tamanho do vetor: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];  // tipo[] nomeVariável = new tipo[tamanho]
		
		for(int i=0; i<n; i++) {
			System.out.println("Insira número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma += vetor[i];
		}
		double media = soma / n;
		System.out.printf("Média: %.2f%n", media);
		
		
		
		sc.close();
	}

}
