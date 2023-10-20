package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula51 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		char res;

		do {
			System.out.println("Digite a temperatura e Celsius: ");
			double C = xp.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;

			System.out.printf("Equivale em Fehrenheit: %.2f%n", F);
			System.out.println("Deseja repitir (s/n) ? ");
			res = xp.next().charAt(0);

		} while (res != 'n');

		System.out.println("FIM DO PROGRAMA");

		xp.close();

	}
}