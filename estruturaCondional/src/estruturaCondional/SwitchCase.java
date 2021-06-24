package estruturaCondional;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Dia inválido";
			break;
				
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	    
	}
	

}
