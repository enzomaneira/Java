package aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidade.AluguelCarro;
import model.entidade.Veiculo;
import model.servico.ServicoAluguel;
import model.servico.TaxaBr;

public class App {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("Data do aluguel: ");
		System.out.print("Início (dd/MM/yyyy HH:mm): ");
		Date recebimento = (Date) sdf.parse(sc.nextLine());
		System.out.print("Devolução (dd/MM/yyyy HH:mm): ");
		Date entrega = (Date) sdf.parse(sc.nextLine());
		
		AluguelCarro cr = new AluguelCarro(recebimento, entrega, new Veiculo(modelo));

		System.out.print("Preço por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Preço por dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoAluguel sa = new ServicoAluguel(precoDia, precoHora, new TaxaBr());
		
		ServicoAluguel.processamentoFatura(cr);

		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + String.format("%.2f", cr.getFatura().getPagBasico()));
		System.out.println("Taxa: " + String.format("%.2f", cr.getFatura().getTaxaFinal()));
		System.out.println("Pagamento final: " + String.format("%.2f", cr.getFatura().getPagTotal(precoDia, precoDia)));
		
		sc.close();
	}

	}


