package tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	private Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	
	

}
