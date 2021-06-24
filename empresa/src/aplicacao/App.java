package aplicacao;
import java.util.Scanner;
import empresa.Funcionario;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("--------------------ManeiraCorp-------------------");
		System.out.println("Insira nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Insira salário bruto do funcionário: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Insira imposto sobre salário: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println(funcionario.toString());
		
		System.out.println("Deseja aumentar salário do funcionário?(s/n): ");		
		String resp = sc.next();
		
		if(resp == "s") {
			System.out.println("Insira porcentagem de aumento do salário: ");
			double aumento = sc.nextDouble();
			funcionario.aumentaSalario(aumento);
			System.out.println(funcionario.toString());
			System.out.println("Programa Finalizado");
		}
		else if(resp == "n") {
			System.out.println("Programa Finalizado");
		}
		else {
			System.out.println("Entrada inválida");
		}
		
		sc.close();

		
	}

}
