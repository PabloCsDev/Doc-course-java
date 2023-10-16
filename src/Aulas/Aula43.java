package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula43 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner (System.in);

		double largura = xp.nextDouble();
		double comprimento = xp.nextDouble();
		double metroQuadrado = xp.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

	xp.close();
	}

}
