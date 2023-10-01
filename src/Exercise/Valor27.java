package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class Valor27 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		int codP1, numberP1, codP2, numberP2;
		double valorUniP1, valorUniP2, p1, p2, total;

		System.out.println(" Informe o código do produto tipo 1:");
		codP1 = xp.nextInt();
		System.out.println();

		System.out.println(" Informe a quantidade de produtos tipo 1: ");
		numberP1 = xp.nextInt();
		System.out.println();

		System.out.println(" Informe o valor da unidade do produto 1: ");
		valorUniP1 = xp.nextDouble();
		System.out.println();

		System.out.println(" Informe o código do produto tipo 2: ");
		codP2 = xp.nextInt();
		System.out.println();

		System.out.println(" Informe a quantidade de produtos tipo 2: ");
		numberP2 = xp.nextInt();
		System.out.println();

		System.out.println(" Informe o valor da unidade do produto 2: ");
		valorUniP2 = xp.nextDouble();
		System.out.println();
		
		p1 = numberP1 * valorUniP1;
		p2 = numberP2 * valorUniP2;
		total = p1 + p2;

		System.out.printf(" Somando todos os produtos o senhor deverá pagar: U$ %.2f%n", total);


		xp.close();
	}

}
