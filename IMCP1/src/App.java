import javax.swing.JOptionPane;


public class App {
	public float CalculoImc(float peso, float altura){

		float imc;
		imc=(peso)/(altura*altura);
		return imc;

		}
		}

		PessoaCalculoIMC.java

		public class PessoaCalculoIMC {

		public static void main(String args[]){
		IMC a=new IMC();

		float ResultadoIMC;
		String Peso=JOptionPane.showInputDialog(“Digite o Peso”);

		float peso=Float.parseFloat(Peso);
		String Altura=JOptionPane.showInputDialog(“Digite a Altura”);

		float altura=Float.parseFloat(Altura);
		ResultadoIMC=a.CalculoImc(peso, altura);
		System.out.println(ResultadoIMC);
		
		if( ResultadoIMC &gt 30 )

			System.out.println("Obesidade");

			else if (ResultadoIMC &gt 25);

			System.out.println("Acima do peso normal");

			else if (ResultadoIMC &gt 18.5)

			System.out.println("Peso normal");

			else

			System.out.println("Abaixo do peso normal");
		
		}
		}

}
