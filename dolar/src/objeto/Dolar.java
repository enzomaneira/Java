package objeto;

public class Dolar {

	public double valorCompra;
	public static double valorDolar = 5.40;
	public static double IOF = 1.10;
	
	public double valorConvertido() {
		return valorDolar * valorCompra * (IOF + 1);
	}
	
}
