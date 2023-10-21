package exerciciosA34;
import java.util.Scanner;

public class Tabela34 {

		public static void main(String[] args) {

			Scanner xy = new Scanner(System.in);
			
			int codigo, quantidade;
			double total;

			
			System.out.println(" Ola, veja a tabela e escolha seu produto ");
			System.out.println("   1 - Hot Dog - R$ 4.00\n"
					+ "   2 - X-Salada - R$ 4.50\n"
					+ "   3 - x-bacon - R$ 5.00\n"
					+ "   4 - Torrada Simples - R$ 2.00\n"
					+ "   5 - Refrigerante - R$ 1.50");
			
			System.out.println(" Informe o codigo do produto escolhido: ");
			codigo = xy.nextInt();
			
			System.out.println(" Informe a quantidade: ");
			quantidade = xy.nextInt();
			
			if (codigo == 1) {
				total = quantidade * 4.0;
			}
			else if (codigo == 2) {
				total = quantidade * 4.5;
			}
			else if (codigo == 3) {
				total = quantidade * 5.0;
			}
			else if (codigo == 4) {
				total = quantidade * 2.0;
			}
			else {
				total = quantidade * 1.5;
			}

			System.out.printf("Total a pagar 2: R$ %.2f%n", total);
			
			xy.close();
		}
	}

