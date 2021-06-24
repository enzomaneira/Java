package application;
import java.util.Scanner;

import entities.Triangulo;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Insira os lados do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira os lados do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do Triângulo A: %.4f.%n", areaX);
		System.out.printf("Área do Triângulo B: %.4f.%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Triângulo X é maior");
		}
		else {
			System.out.println("Triângulo Y é maior");
		}
		
		sc.close();
				
				
	}

}
