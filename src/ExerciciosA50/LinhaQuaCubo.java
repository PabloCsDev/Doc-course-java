package ExerciciosA50;

import java.util.Locale;
import java.util.Scanner;

public class LinhaQuaCubo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int n = xp.nextInt();

		for (int i = 1; i <= n; i++) {

			int linha = i; 
			int aoQuadrado = i * i;
			int aoCubo = i * i * i;
			System.out.printf("%d %d %d%n", linha, aoQuadrado, aoCubo);
		}

		xp.close();
	}
}
