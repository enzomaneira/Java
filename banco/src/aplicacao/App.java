package aplicacao;
import java.util.Scanner;

import model.exceptions.DomainException;
import objeto.Cliente;

public class App {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		try {
			Cliente cliente = null;
			System.out.println("-------------------ManeiraBank-----------------------------");
			System.out.println("Cadastrar nome: ");
			String nome = sc.nextLine();
			System.out.print("Insira número de cadastro desejado: ");
			int cadastro = sc.nextInt();
			System.out.println("Insira limite de saque: ");
			double limite = sc.nextDouble();
			

			System.out.println("Deseja fazer um depósito inicial?(s/n)");
			char resp = sc.next().charAt(0);
			
			if (resp == 's'){
				System.out.println("Insira valor do deposito inicial: ");
				double valorDeposito = sc.nextDouble();
				cliente = new Cliente(nome, cadastro, limite);
				cliente.deposito(valorDeposito);
			}
			else if (resp == 'n'){
				cliente = new Cliente(nome, cadastro, limite);
		    }
			
			
			System.out.println("----------------CONTA-----------------");
			System.out.println(cliente);
			
			System.out.println("\nValor a ser depositado: ");
			double valorDeposito = sc.nextDouble();
			cliente.deposito(valorDeposito);
			System.out.println(cliente);
			
			System.out.println("\nValor a ser sacado: ");
			double valorSaque = sc.nextDouble();
			cliente.saque(valorSaque);
			System.out.println(cliente);
		}
		catch (DomainException e) {
			System.out.println("Erro ao sacar: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
			
		sc.close();
		
	}
}
