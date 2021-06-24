package aplicacao;

import objeto.Empresa;
import objeto.Pessoa;
import objeto.Saving;

public class App {
	public static void main(String[] args) {
		
		Pessoa acc = new Pessoa(1001, "Alex", 0.0);
		Empresa bacc = new Empresa(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Pessoa acc1 = bacc;
		Pessoa acc2 = new Empresa(1003, "Bob", 0.0, 200.0);
		Pessoa acc3 = new Saving(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		Empresa acc4 = (Empresa)acc2;
		acc4.emprestimo(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof Empresa) {
		   Empresa acc5 = (Empresa)acc3;
		   acc5.emprestimo(200.0);
		   System.out.println("Loan!");
		}
		
		if (acc3 instanceof Saving) {
		   Saving acc5 = (Saving)acc3;
		   acc5.updateSaldo();
		   System.out.println("Update!");
		}
	}
	


}
