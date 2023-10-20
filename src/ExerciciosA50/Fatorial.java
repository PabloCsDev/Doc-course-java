package ExerciciosA50;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		System.out.println("Informe um numero: ");
		int n = xp.nextInt();

		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}

		System.out.println(fat);

		xp.close();

	}
}
