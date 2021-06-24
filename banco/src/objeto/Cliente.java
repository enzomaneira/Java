package objeto;

import model.exceptions.DomainException;

public class Cliente {
	
	private String nome;
	private int cadastro;
	private double saldo;
	private double limite;
	
	public Cliente (String nome, int cadastro, double limite){
		this.nome = nome;
		this.cadastro = cadastro;
		this.limite = limite;
	}
	
	public Cliente (String nome, int cadastro, double saldo, double limite){
		this.nome = nome;
		this.cadastro = cadastro;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCadastro() {
		return cadastro;
	}
	
	public double getSaldo() {
		return saldo;
	}

	
	public void deposito(double valorDeposito) {
		this.saldo += valorDeposito; 
	}
	
	public void saque(double valorSaque) {
		if (valorSaque > limite) {
			throw new DomainException("Saque ultrapassa limite da conta");
		}
		else if(saldo < valorSaque) {
			throw new DomainException("Saldo insuficiente");
		}
		else {
			this.saldo -= valorSaque;
		}
	}
	
	public String toString() {
		return "Titular da Conta: " + nome + "\nCadastro: "
				+ cadastro + "\nSaldo: R$" + saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}

