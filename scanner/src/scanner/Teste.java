package scanner;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x, s1;
		s1 = sc.nextLine();
		sc.nextLine();  // para quando tiver varios nextline deixar esse para pegar o espaço livre
		
		System.out.println(s1);
		
		x = sc.next();
		System.out.println("Você digitou: " + x);
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		char z;
		z = sc.next().charAt(0);
		System.out.println("Primeira letra digitada: " + z);
		
		// command + shift + f faz identação
		
		s1 = sc.nextLine();
		System.out.println(s1);
		
		sc.close();
		
		
	}

}
