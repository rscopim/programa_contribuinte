package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empresarial;
import entities.Individual;
import entities.TaxaPagamento;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		List<TaxaPagamento> list = new ArrayList<TaxaPagamento>();
		
		System.out.print("Entre com o número de contribuinte: ");
		int N = sc.nextInt();
	
				
		for (int i = 1; i <= N; i++) {
			System.out.println("Contribuinte #" + i + "data:");
			System.out.print("Individual ou empresarial (I/ E)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Gastos com Saúde: ");
				Double gastosComSaude = sc.nextDouble();
				list.add(new Individual(nome, rendaAnual, gastosComSaude));
			}
			else {
				System.out.print("Número do funcionários: ");
				Integer numeroDeFuncionarios = sc.nextInt();
				list.add(new Empresarial(nome, rendaAnual, numeroDeFuncionarios));
			}
			
			System.out.println();
			System.out.println("Imposto Pago: ");
			for (TaxaPagamento tp : list) {
				System.out.println(tp.getNome() + " : $ " + String.format("%.2f", tp.imposto()));
			}
			
			double sum = 0.0;
			for (TaxaPagamento tp : list) {
				sum += tp.imposto();				
			}
			System.out.println("Imposto pago: $ " + String.format("%2f",  sum));
					
		}
		
		sc.close();
		
	}

}
