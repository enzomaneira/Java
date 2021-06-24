package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date datap;
	private double valor;
	
	public Prestacao(Date datap, double valor) {
		this.datap = datap;
		this.valor = valor;
	}

	public Date getDatap() {
		return datap;
	}

	public void setDatap(Date datap) {
		this.datap = datap;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Prestacao [datap=" + datap + ", valor=" + valor + "]";
	}

	
	
	
	

}
