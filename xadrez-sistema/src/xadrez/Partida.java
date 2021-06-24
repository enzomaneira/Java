package xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class Partida {
	
	private Tabuleiro tabuleiro;
	
	public Partida() {
		tabuleiro = new Tabuleiro(8, 8);
		initialSetup();
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++ ) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;	
	}
	
	public PecaXadrez performaMovimento(PosicaoXadrez posicaoOrigem, PosicaoXadrez posicaoDestino) {
		Posicao origem = posicaoOrigem.toPosicao();
		Posicao destino = posicaoDestino.toPosicao();
		validaOrigem(origem);
		Peca pecaCapturada = fazMovimento(origem, destino);
		return (PecaXadrez)pecaCapturada;
	}
	
	private Peca fazMovimento(Posicao origem, Posicao destino) {
		Peca p = tabuleiro.removePeca(origem);
		Peca pecaCapturada = tabuleiro.removePeca(destino);
		tabuleiro.lugarPeca(p, destino);
		return pecaCapturada;
	}
	
	private void validaOrigem(Posicao posicao) {
		if(!tabuleiro.existePeca(posicao)) {
			throw new ExcessaoXadrez("Não existe peça na posição de origem digitada");
		}
	}
	
	private void colocaNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.lugarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}
	
	private void initialSetup() {
		colocaNovaPeca('a', 8, new Torre(tabuleiro, Cor.WHITE));
		colocaNovaPeca('h', 8, new Torre(tabuleiro, Cor.WHITE));
		colocaNovaPeca('d', 8, new Rei(tabuleiro, Cor.WHITE));
		colocaNovaPeca('a', 1, new Torre(tabuleiro, Cor.BLACK));
		colocaNovaPeca('h', 1, new Torre(tabuleiro, Cor.BLACK));
		colocaNovaPeca('e', 1, new Rei(tabuleiro, Cor.BLACK));
	} 

}
