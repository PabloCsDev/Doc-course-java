package ExerciciosA50;

import java.util.Locale;
import java.util.Scanner;

public class IntervaloA50 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		System.out.println("Informe um numnero: ");
		int n = xp.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Informe um numero: ");
			int x = xp.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		xp.close();
	}

}
