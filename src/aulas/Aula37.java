 package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula37 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xy = new Scanner(System.in);

		int minutos;
		double conta, total;
		conta = 50;

		System.out.println("Informe o numero de minutos ultilizados pelo senhor: ");
		minutos = xy.nextInt();

		if (minutos > 100) {
			total = conta + (minutos - 100) * 2.0;
			System.out.println("O senhor ultrapassou o limite de minutos , portanto" + " devera pagar R$ " + conta
					+ " que é o valor do seu contrato fixo mensal, mais os minutos que voce ultrapassou do seu limite"
					+ " de 100 minutos mensais propostos ao seu contrato , cada minuto a mais custa R$2,00"
					+ ".Portanto o senhor irá pagar esse mes uma fatura com valor de : R$ " + total);
		} else {
			System.out.println(" O senhor nao ultrapassou o limite maximo de minutos"
					+ " ,portanto devera pagar somente o valor fixo de R$50");
		}

		xy.close();
	}
}
