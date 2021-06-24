package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Livro;
import model.Pessoa;

public class Funcao {
	
	static Scanner sc = new Scanner(System.in);
	
	static List<Livro> listaL = new ArrayList<>();
	static List<Pessoa> listaP = new ArrayList<>();
	
	public static void menu() {
		System.out.println("-------------Menu-------------");
		System.out.println("1 - Adicionar usuário");
		System.out.println("2 - Adicionar livro");
		System.out.println("3 - Realizar empréstimo");
		int op = sc.nextInt();
		if(op==1) {
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("ID: ");
			int id = sc.nextInt();
			Pessoa pessoa = new Pessoa(nome, id);
			listaP.add(pessoa);
			menu();
		}
		else if(op==2) {
			System.out.println("Título livro: ");
			String nome = sc.next();
			System.out.println("Autor: ");
			String autor = sc.next();
			System.out.println("Número de páginas: ");
			int numPag = sc.nextInt();
			System.out.println("Gênero: ");
			String genero = sc.next();
			System.out.println("Dono do livro: ");
			String dono = sc.next();
			String momento = dono;
			Livro livro = new Livro(nome, autor, numPag, genero, dono, momento);
			listaL.add(livro);
			menu();
		}
		else if(op == 3) {
			System.out.println("Usuários cadastrados: ");
			System.out.println(listaP);
			System.out.println("Livros cadastrados: ");
			System.out.println(listaL);
		}
		sc.close();
	}
}