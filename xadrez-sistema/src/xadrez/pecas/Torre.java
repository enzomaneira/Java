package xadrez.pecas;

import xadrez.PecaXadrez;
import xadrez.Cor;
import tabuleiro.Tabuleiro;

public class Torre extends PecaXadrez {
	
	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return " T";
	}

}
