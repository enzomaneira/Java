package empresa;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido(){
		double desconto = (imposto * salarioBruto) / 100;
		return salarioBruto - desconto;
	}
	
	public void aumentaSalario(double aumento){
		double aumentofinal = (aumento * salarioBruto) / 100;
		this.salarioBruto += aumentofinal;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nSalário Bruto: R$" + salarioBruto + "\nImposto: " + imposto
				+ "%" +  "\nSalário Líquido: R$" + salarioLiquido(); 
	}

}
