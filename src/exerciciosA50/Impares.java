package exerciciosA50;

import java.util.Locale;
import java.util.Scanner;

public class Impares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		int x = xp.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		xp.close();

	}

}