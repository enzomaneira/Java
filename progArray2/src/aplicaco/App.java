package aplicaco;
import java.util.Scanner;
import objeto.Produto;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextInt();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			int quantidade = sc.nextInt();
			vetor[i] = new Produto(nome, preco, quantidade);
		}
		
		double soma = 0;
		for(int i=0; i<vetor.length;i++) {
			soma += vetor[i].getPreco();
		}
		double media = soma / vetor.length;
		
		System.out.printf("Média do preço: %.2f%n", media);
		
		sc.close();
	}

}
