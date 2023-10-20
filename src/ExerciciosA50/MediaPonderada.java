package ExerciciosA50;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int n = xp.nextInt();

		for (int i = 0; i < n; i++) {

			double a = xp.nextDouble();
			double b = xp.nextDouble();
			double c = xp.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);

		}
		xp.close();
	}
}
