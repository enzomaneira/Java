package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		metodo1();
		
		System.out.println("Fim do programa");
		
	}
	
	public static void metodo1() {
		System.out.println("Método 1 start");
		metodo2();
		System.out.println("Fim método 1");
	}
	
	
		public static void metodo2() {
			System.out.println("Método 2 start");
			Scanner sc = new Scanner(System.in);
			
			try {
				String[] vect = sc.nextLine().split(" ");
				int p = sc.nextInt();
				System.out.println(vect[p]);
				
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posição inválida");
				e.printStackTrace();         // rastreia os metodos que chamaram até o erro
				sc.next();
			}
			catch(InputMismatchException e) {
				System.out.println("Input Error");
			}
			sc.close();
			System.out.println("Fim do método 2");
		}
		
	

}
