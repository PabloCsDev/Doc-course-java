package ExerciciosA50;

import java.util.Locale;
import java.util.Scanner;

public class Divisores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		int n = xp.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		xp.close();

	}

}
