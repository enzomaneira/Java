package entidade;

public class Pessoa {
	
	private String nome;
	private double peso;
	private double altura;
	public double imc;
	
	
	public Pessoa(String nome, double peso, double altura, double imc){
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void calculaIMC() {
		this.imc = peso / (altura * altura);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Peso: " + peso + "kg, Altura: " + altura + "m, IMC: " + String.format("%.2f", imc);
	}
	
	

}
