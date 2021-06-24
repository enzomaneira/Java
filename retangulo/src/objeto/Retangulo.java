package objeto;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return (altura * 2) + (largura * 2);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}

}
