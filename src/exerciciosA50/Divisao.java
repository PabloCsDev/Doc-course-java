package exerciciosA50;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		System.out.println("Informe um numero: 3");
		int n = xp.nextInt();

		for (int i = 0; i < n; i++) {

			int x = xp.nextInt();
			int y = xp.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}

		xp.close();
	}

}
