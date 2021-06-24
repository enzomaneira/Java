package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entidade.Pessoa;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Insira nome: ");
			String nome = sc.nextLine();
			System.out.println("Insira peso: ");
			double peso = sc.nextDouble();
			System.out.println("Insira altura: ");
			double altura = sc.nextDouble();
			double imc = 0;

			Pessoa pessoa = new Pessoa(nome, peso, altura, imc);
			
			pessoa.calculaIMC();
			
			if (pessoa.imc <= 19) {
				System.out.println(pessoa);
				System.out.println("Abaixo do Peso");
			} else if ((pessoa.imc <= 25)&&(pessoa.imc > 19)) {
				System.out.println(pessoa);
				System.out.println("Peso ideal");
			} else if ((pessoa.imc <= 30)&&(pessoa.imc > 25)) {
				System.out.println(pessoa);
				System.out.println("Acima do peso");
			} else if ((pessoa.imc <= 35)&&(pessoa.imc > 30)) {
				System.out.println(pessoa);
				System.out.println("Obesidade leve");
			} else {
				System.out.println(pessoa);
				System.out.println("Obesidade");
			}
			
			String[] lines = new String[] {"Nome: " + nome + ", Peso: " + peso + "kg, Altura: " + 
			altura + "m, IMC: " + String.format("%.2f", pessoa.imc)};
			String path = "imc.txt";
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
				for (String line : lines) {
					bw.write(line);
					bw.newLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		catch(Exception e) {
			System.out.println("Error: formato de digitação incorreto nos campos peso ou altura!");
		}
		sc.close();
	}

}
