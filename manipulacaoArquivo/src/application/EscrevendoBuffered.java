package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoBuffered {
	public static void main(String[] args) {
		String[] lines = new String[] { "Vai Corinthians" };
		String path = "output.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}