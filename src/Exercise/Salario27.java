package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class Salario27 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner xp = new Scanner(System.in);
		/*
		 * nf= NumeroFuncionario; nht= NumeroHorasTrabalhadas; vhf= ValorDaHoraFixo
		 */

		int nf;
		double nht;
		double vhf = 15.00;

		System.out.println(" Digite seu numero de funcionario: ");
		nf = xp.nextInt();
		System.out.println();

		System.out.println(" Informe o total de horas trabalhadas : ");
		nht = xp.nextDouble();
		System.out.println();

		double salario = nht * vhf;

		System.out.println(" A empresa tem um valor fixo de U$ 15 por hora trabalhada.");
		System.out.printf(
				"Portanto o senhor funcionário número %d trabalhou %.2f horas, "
						+ "multiplicando-as pelo valor fixado, o senhor vai receber um salário total de U$ %.2f%n",
				nf, nht, salario);

		xp.close();

	}

}
