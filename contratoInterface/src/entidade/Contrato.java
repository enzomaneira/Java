package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private int numero;
	private Date data;
	private double valorTotal;
	
	private List<Prestacao> prestacao = new ArrayList<>();
	
	public Contrato() {
		
	}
	
	public Contrato(int numero, Date data, double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public List<Prestacao> getPrestacao() {
		return prestacao;
	}

	public void addPrestacao(Prestacao prestacao) {
		prestacao.add(prestacao);
	}

	public void removePrestacao(Prestacao prestacao) {
		prestacao.remove(prestacao);
	}
	
	
}
