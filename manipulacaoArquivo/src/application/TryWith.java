package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWith {
	public static void main(String[] args) {
		String path = "ler.txt";        // path = arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {       // instanciando file e buffered junto
			String line = br.readLine();                                           // se instanciou cria variavel tipo String Line e le arquivo
			while (line != null) {                                                 // enquanto linha nao for nula 
				System.out.println(line);                                           // printa linha
				line = br.readLine();                                               // declara linha como readline novamente
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}