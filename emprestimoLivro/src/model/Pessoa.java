package model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private int id;
	
	public Pessoa (String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", id=" + id + "]";
	}
	

}
