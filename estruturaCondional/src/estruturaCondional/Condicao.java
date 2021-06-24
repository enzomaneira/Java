package estruturaCondional;
import java.util.Scanner;


public class Condicao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?\n");
		hora = sc.nextInt();
		
		if ((hora < 12)&&(hora >=6)) {
			System.out.println("Bom dia");
		}
		else if((hora < 18)&&(hora >= 12)){
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		
	}

}
