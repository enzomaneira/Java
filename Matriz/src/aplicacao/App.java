package aplicacao;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.printf("Número posição %d %d: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal");
		for(int i=0;i<n;i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		int c = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++) {
				if(matriz[i][j]<0) {
					c++;
				}
			}		
		}
		
		System.out.println("Números negativos: " + c);
		sc.close();
	}

}
