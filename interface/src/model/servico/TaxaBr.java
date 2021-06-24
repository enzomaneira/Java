package model.servico;

public class TaxaBr implements Taxa{
	
	public double taxaFinal(double quantia) {
		if(quantia<=100) {
			return quantia * 0.2;
		}
		else {
			return quantia * 0.15;
		}
	}
}


