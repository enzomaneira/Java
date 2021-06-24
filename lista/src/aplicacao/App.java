package aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Enzo");
		list.add("Stef");
		list.add("Ale");
		list.add("Bat");
		list.add("Mello");
		list.add("Lucas");
		list.add(2, "Felps");
		
		System.out.println(list.size());
		
		//list.remove(3);
		//list.removeIf(x -> x.charAt(0) == "L");
		
		
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("Index Mello: " + list.indexOf("Mello"));
		
		//List<String> resultado = list.stream().filter(x -> x.charAt(0) == "E").collect(Collectors.toList());
		
		//String nome = list.stream().filter(x -> x.charAt(0) == "S").findFirst().orElse(nulll);

		
		sc.close();
	}

}
