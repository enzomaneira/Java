package aplicacao;

import java.util.Scanner;

import tabuleiro.ExcessaoTabuleiro;
import xadrez.ExcessaoXadrez;
import xadrez.Partida;
import xadrez.PecaXadrez;
import xadrez.PosicaoXadrez;

public class AppX {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Partida partida = new Partida();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printTabuleiro(partida.getPecas()); 
				System.out.println();
				System.out.println("Posição de origem: ");
				PosicaoXadrez origem = UI.lePosicaoXadrez(sc);
				
				System.out.println();
				System.out.println("Posição de destino: ");
				PosicaoXadrez destino = UI.lePosicaoXadrez(sc);
				
				PecaXadrez pecaCapturada = partida.performaMovimento(origem, destino);
			}
			catch(ExcessaoXadrez e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(ExcessaoTabuleiro e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}

}
