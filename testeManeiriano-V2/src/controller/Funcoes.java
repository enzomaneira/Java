package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Usuario;


public class Funcoes {
	
	static Scanner sc = new Scanner(System.in);
	
	static List<Usuario> lista = new ArrayList<>();
	
	public static void menu() {
		System.out.println("-------------------------MENU--------------------------");
		System.out.println("1 - Cadastrar ");
		System.out.println("2 - Comparar");
		System.out.println("3 - Mostrar cadastrados");
		System.out.println("4 - Remover");
		System.out.println("5 - Sair");
		System.out.println("\n");
		int respMenu = sc.nextInt();
		if (respMenu == 1) {
			cadastro();
			menu();
		}
		else if(respMenu == 2) {
			comparar(null, null);
			menu();
		}
		else if(respMenu == 3) {
			System.out.println(lista);
			menu();
		}
		else if(respMenu == 4) {
			System.out.println("Quem você deseja remover: ");
			String pessoa = sc.next();
			remover(pessoa);
			menu();
		}
		else if(respMenu == 5) {
			sair();
		}
		else {
			System.out.println("Erro");
			menu();
		}
	}
	
	public static void cadastro() {
		System.out.println("------------------------Comparação Maneiriana-----------------------");
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		Usuario usuario = new Usuario(nome, idade);
		lista.add(usuario);
	}
	
	public static void remover(String usuario) {
		lista.remove(usuario);
		System.out.println(usuario + " removidx com sucesso");
		
	}
	
	public static void sair() {
		System.out.println("end thread!");
	}
	
	public static void comparar(Usuario usuario1, Usuario usuario2) {
		//implementar
	}
	
	

}
