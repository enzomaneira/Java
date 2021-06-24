package model;

public class Emprestimo {
	
	private Pessoa emprestando;
	private Pessoa emprestado;
	private Livro livro;
	
	public Pessoa getEmprestando() {
		return emprestando;
	}
	
	public Pessoa getEmprestado() {
		return emprestado;
	}
	
	public Livro getLivro() {
		return livro;
	}

	@Override
	public String toString() {
		return "Emprestimo [emprestando=" + emprestando + ", emprestado=" + emprestado + ", livro=" + livro + "]";
	}
	
}
