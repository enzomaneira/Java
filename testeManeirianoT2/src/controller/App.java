package controller;
import java.util.Scanner;


import model.Perguntas;
import model.Usuario;
import view.Menu;
import controller.Cadastro;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 Cadastro cadUsuario = new Cadastro();
		
		Menu.menu();
		int op = sc.nextInt();
		
		
		while(op < 4) {
			switch(op) {
			
			case 1:
				System.out.println("Nome: ");
				String nome = sc.next();
				System.out.println("Idade: ");
				int idade = sc.nextInt();
				System.out.println("ID: ");
				int id = sc.nextInt();
				Perguntas.perg1();
				int p1 = sc.nextInt();
				Perguntas.perg2();
				int p2 = sc.nextInt();
				Perguntas.perg3();
				int p3 = sc.nextInt();
				Perguntas.perg4();
				int p4 = sc.nextInt();
				Perguntas.perg5();
				int p5 = sc.nextInt();
				Perguntas.perg6();
				int p6 = sc.nextInt();
				Perguntas.perg6();
				int p7 = sc.nextInt();
				Perguntas.perg8();
				int p8 = sc.nextInt();
				Perguntas.perg9();
				int p9 = sc.nextInt();
				Perguntas.perg10();
				int p10 = sc.nextInt();
				
				Usuario usuario = new Usuario(nome, idade, id, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
				cadUsuario.inserir(usuario);
				
				Menu.menu();
				op = sc.nextInt();
				
				break;
				
			case 2:
				System.out.println("Nome do usuario a ser removido: ");
				String nomeR = sc.next();
				cadUsuario.remover(nomeR);
				
				Menu.menu();
				op = sc.nextInt();
				
				break;
				
			case 3:
				
				cadUsuario.listar();
				System.out.println("Nome do primeiro usuário a ser comparado: ");
				String nome1 = sc.next();
				int p1A = cadUsuario.buscarP1(nome1);
				System.out.println("P1: " + p1A);
				int p2A = cadUsuario.buscarP2(nome1);
				System.out.println("P2: " + p2A);
				int p3A = cadUsuario.buscarP3(nome1);
				System.out.println("P3: " + p3A);
				int p4A = cadUsuario.buscarP4(nome1);
				System.out.println("P4: " + p4A);
				int p5A = cadUsuario.buscarP5(nome1);
				System.out.println("P5: " + p5A);
				int p6A = cadUsuario.buscarP6(nome1);
				System.out.println("P6: " + p6A);
				int p7A = cadUsuario.buscarP7(nome1);
				System.out.println("P7: " + p7A);
				int p8A = cadUsuario.buscarP8(nome1);
				System.out.println("P8: " + p8A);
				int p9A = cadUsuario.buscarP9(nome1);
				System.out.println("P9: " + p9A);
				int p10A = cadUsuario.buscarP10(nome1);
				System.out.println("P10: " + p10A);
				
				System.out.println("Nome do segundo usuário a ser comparado: ");
				String nome2 = sc.next();
				int p1B = cadUsuario.buscarP1(nome2);
				System.out.println("P1: " + p1B);
				int p2B = cadUsuario.buscarP2(nome2);
				System.out.println("P2: " + p2B);
				int p3B = cadUsuario.buscarP3(nome2);
				System.out.println("P3: " + p3B);
				int p4B = cadUsuario.buscarP4(nome2);
				System.out.println("P4: " + p4B);
				int p5B = cadUsuario.buscarP5(nome2);
				System.out.println("P5: " + p5B);
				int p6B = cadUsuario.buscarP6(nome2);
				System.out.println("P6: " + p6B);
				int p7B = cadUsuario.buscarP7(nome2);
				System.out.println("P7: " + p7B);
				int p8B = cadUsuario.buscarP8(nome2);
				System.out.println("P8: " + p8B);
				int p9B = cadUsuario.buscarP9(nome2);
				System.out.println("P9: " + p9B);
				int p10B = cadUsuario.buscarP10(nome2);
				System.out.println("P10: " + p10B);
				
				double D = Math.sqrt( ((p1A - p1B)*(p1A - p1B)) + ((p2A - p2B)*(p2A - p2B)) + ((p3A - p3B)*(p3A - p3B)) + ((p4A - p4B)*(p4A - p4B)) + ((p5A - p5B)*(p5A - p5B)) + 
						((p6A - p6B)*(p6A - p6B)) + ((p7A - p7B)*(p7A - p7B)) + ((p8A - p8B)*(p8A - p8B)) + ((p9A - p9B)*(p9A - p9B)) + ((p10A - p10B)*(p10A - p10B))) * 10;
				
				
				System.out.printf("\nPorcentagem de semelhança: " + "%.2f", D + "%\n");
				
				Menu.menu(); 
				op = sc.nextInt();
				
			case 4:
			
				break;
				
		}
			
		}
		
		
		sc.close();
		

		
	}
}
