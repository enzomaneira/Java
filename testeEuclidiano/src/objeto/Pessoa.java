package objeto;

public class Pessoa {
	
	private String nome;
	private int idade;
	private int score;
	
	public Pessoa(String nome, int idade, int score) {
		this.nome = nome;
		this.idade = idade;
		this.score = score;
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

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", score=" + score + "]";
	}	

}
