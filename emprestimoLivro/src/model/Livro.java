package model;

public class Livro {
	
	private String nome;
	private String autor;
	private int numPag;
	private String genero;
	private String dono;
	private String momento;
	

	public Livro(String nome, String autor, int numPag, String genero, String dono, String momento) {
		this.nome = nome;
		this.autor = autor;
		this.numPag = numPag;
		this.genero = genero;
		this.dono = dono;
		this.momento = momento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getDono() {
		return dono;
	}

	public String getMomento() {
		return momento;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", numPag=" + numPag + ", genero=" + genero + ", dono="
				+ dono + ", momento=" + momento + "]";
	}
	
	

}
