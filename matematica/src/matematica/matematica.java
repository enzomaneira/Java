package matematica;
import java.util.Scanner;

public class matematica {
   public static void main(String[] args) {
	   
	Scanner sc = new Scanner(System.in);
	
	double x, y, z;
	double A, B, C;
	
	System.out.print("Insira a variável x: ");
	x = sc.nextDouble();
	System.out.print("Insira a variável y: ");
	y = sc.nextDouble();
	System.out.print("Insira a variável z: ");
	z = sc.nextDouble();
	A = Math.sqrt(x);
	B = Math.pow(y, 2);
	C = Math.abs(z);
	
	System.out.printf("Raiz quadrado de %f = %f", x, A);
	System.out.printf("%d elevado ao quadrado = %f", y, B);
	System.out.printf("Valor de absoluta de %f = %f", z, C);
	
	
   }
}
