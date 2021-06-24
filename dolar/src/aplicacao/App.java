package aplicacao;
import java.util.Scanner;
import objeto.Dolar;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Dolar dolar = new Dolar();
		
		System.out.println("-----------Conversão de Dolar------------");
		System.out.println("Cotação do dolar: $" + Dolar.valorDolar);
		System.out.println("Valor IOF: " + Dolar.IOF + "%");
		System.out.println("Insira o valor de dolares a ser comprado: ");
		dolar.valorCompra = sc.nextDouble();
		System.out.println("Valor a ser pago: R$" + dolar.valorConvertido());
		
		sc.close();
		
	}

}
