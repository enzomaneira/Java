package estruturasRepetitivas;
import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor de X\n");
		int x = sc.nextInt();
		
		int soma = 0;
		while(x!=0) {
			soma = soma + x;
			System.out.println("Soma = " + soma);
			System.out.println("\nDigite valor de X para somar\n");
			x = sc.nextInt();

		}
		System.out.println("Soma finalizada = " + soma);
		
		sc.close();
	}

}
