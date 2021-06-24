package model.servico;

import model.entidade.AluguelCarro;
import model.entidade.Fatura;

public class ServicoAluguel {
	
	private static double precoDia;
	private static double precoHora;
	
	private static Taxa taxa;
	
	public ServicoAluguel(double precoDia, double precoHora, TaxaBr taxa) {
		this.precoDia = precoDia;
		this.precoHora = precoHora;
		this.taxa = taxa;
	}
	
	public static void processamentoFatura(AluguelCarro aluguelCarro) {
		long t1 = aluguelCarro.getRecebimento().getTime();
		long t2 = aluguelCarro.getEntrega().getTime();
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double pagBasico;
		
		if(horas <= 12) {
			pagBasico = precoHora * Math.ceil(horas);
		}
		else {
			pagBasico = precoDia * Math.ceil(horas / 24);
		}
		
		double taxaFinal = taxa.taxaFinal(pagBasico);
		
		aluguelCarro.setFatura(new Fatura(pagBasico, taxaFinal));
	
	}
}
