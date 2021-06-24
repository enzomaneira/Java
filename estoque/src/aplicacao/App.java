package aplicacao;
import java.util.Scanner;

import entidade.Produto;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dados do produto");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		//produto.setNome("qualquer um");
		//System.out.println("Nome atualizado " + produto.getNome());
		
		System.out.println(produto.toString());
		
		System.out.println();
		System.out.print("Quantidade a ser adicionada no estoque: ");
		quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println();
		System.out.println("Atualizado: " + produto);
		System.out.println();
		System.out.print("Quantidade a ser removida do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println();
		System.out.println("Atualizado: " + produto);
		
		sc.close();
	}

}
