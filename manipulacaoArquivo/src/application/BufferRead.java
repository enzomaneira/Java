package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
	public static void main(String[] args) {
		String path = "ler.txt";    // declarando arquivo
		BufferedReader br = null;   
		FileReader fr = null;
		try {
			fr = new FileReader(path);    // instanciando o fileReader recebendo o arquivo 
			br = new BufferedReader(fr);  // instanciando o BufferedReader recebendo o FileReader
			String line = br.readLine();   // declara variavel String que le linha do arquivo
			while (line != null) {         // enquanto linha nao for nula
				System.out.println(line);   // le linha
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null)     // se bufferedreader nao for nulo   
					br.close();     // fecha
				if (fr != null)     // se filereader nao for nulo
					fr.close();     // fecha
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}