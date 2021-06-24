package model.entidade;

public class Fatura {
	
	private double pagBasico;
	private double taxaFinal;
	
	public Fatura() {
		
	}
	
	public Fatura(double pagBasico, double taxaFinal) {
		this.pagBasico = pagBasico;
		this.taxaFinal = taxaFinal;
	}

	public double getPagBasico() {
		return pagBasico;
	}

	public void setPagBasico(double pagBasico) {
		this.pagBasico = pagBasico;
	}

	public double getTaxaFinal() {
		return taxaFinal;
	}

	public void setTaxa(double taxaFinal) {
		this.taxaFinal = taxaFinal;
	}
	
	public double getPagTotal(double pagBasico, double taxaFinal) {
		return getPagBasico() + getTaxaFinal();
	}
	
	

}
