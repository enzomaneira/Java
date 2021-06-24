package model.entidade;

import java.util.Date;

public class AluguelCarro {

	private Date recebimento;
	private Date entrega;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelCarro() {
		
	}
	
	public AluguelCarro(Date recebimento, Date entrega, Veiculo veiculo) {
		this.recebimento = recebimento;
		this.entrega = entrega;
		this.veiculo = veiculo;
	}

	public Date getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(Date recebimento) {
		this.recebimento = recebimento;
	}

	public Date getEntrega() {
		return entrega;
	}

	public void setEntrega(Date entrega) {
		this.entrega = entrega;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
	
	

}
