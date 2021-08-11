package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidade.Funcionario;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		String path = "C:\\Enzo Maneira\\listaFuncionarios.txt.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Funcionario> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.println("Salário a ser filtrado: ");
			double avg = sc.nextDouble();
	
			List<String> email = list.stream() 
					.filter(p -> p.getSalario() < avg)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			email.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x -> x.getNome().charAt(0) == 'M')
					.map(x -> x.getSalario())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
		

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
		
		
		
	}

