package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new ExcessaoTabuleiro("Erro na criação do tabuleiro!");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new ExcessaoTabuleiro("Posição não existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void lugarPeca(Peca peca, Posicao posicao) {
		if(existePeca(posicao)) {
			throw new ExcessaoTabuleiro("Ja existe uma peça na posição: " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	public Peca removePeca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new ExcessaoTabuleiro("Posição não existe no tabuleiro");
		}
		if(peca(posicao) == null) {
			return null;
		}
		Peca aux = peca(posicao);
		aux.posicao = null;
		pecas[posicao.getLinha()][posicao.getColuna()] = null;
		return aux;
	}
	
	private boolean existePosicao(int linha, int coluna) {
		return ((linha >= 0) && (linha < linhas) && (colunas >= 0) && (coluna < colunas)); 
	}
	
	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean existePeca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new ExcessaoTabuleiro("Posição não existe no tabuleiro");
		}
		return peca(posicao) != null;
	}

}
