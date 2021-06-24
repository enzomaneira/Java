package estruturasRepetitivas;
import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de elementos da soma\n");
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<N; i++) {
			System.out.print("Insira valor da soma: ");
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println("Soma = " + soma);
		
		sc.close();
	}
}
