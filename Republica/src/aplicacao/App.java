package aplicacao;
import java.util.Scanner;
import objeto.Aluno;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Aluno quartos[] = new Aluno[10];
		
		System.out.println("Quantos quartos serão alugados?\n");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			quartos[quarto] = new Aluno(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados");
		for(int i=0;i<quartos.length;i++) {
			if(quartos[i]!=null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		
		
		
		
		
		sc.close();
	}

}
