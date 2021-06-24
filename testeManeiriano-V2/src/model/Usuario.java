package model;

public class Usuario {
	
	private String nome;
	private int idade;
	private int p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
	
	
	public Usuario(String nome, int idade, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {
		this.nome = nome;
		this.idade = idade;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.p7 = p7;
		this.p8 = p8;
		this.p9 = p9;
		this.p10 = p10;
	}
	
	public Usuario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getp1() {
		return p1;
	}
	
	public int getp2() {
		return p2;
	}
	
	public int getp3() {
		return p3;
	}
	
	public int getp4() {
		return p4;
	}
	
	public int getp5() {
		return p5;
	}
	
	public int getp6() {
		return p6;
	}
	
	public int getp7() {
		return p7;
	}
	
	public int getp8() {
		return p8;
	}
	
	public int getp9() {
		return p9;
	}
	
	public int getp10() {
		return p10;
	}
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", idade=" + idade +  "]";
	}	

}

