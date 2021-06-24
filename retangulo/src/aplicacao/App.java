package aplicacao;
import java.util.Scanner;

import objeto.Retangulo;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Prog Retângulo\n");
		System.out.println("Insira largura do Retângulo: ");
		retangulo.largura = sc.nextDouble();
		System.out.println("Insira a altura do Retângulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Área: " + retangulo.area());
		System.out.println("Perímetro: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());
		
		
		
		
		sc.close();
	}

}
