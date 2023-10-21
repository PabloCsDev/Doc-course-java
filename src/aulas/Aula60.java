package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula60 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		System.out.println("Digite 3 numeros: ");
		int a = xp.nextInt();
		int b = xp.nextInt();
		int c = xp.nextInt();

		int higer = max(a, b, c);

		if (a > b && a > c) {
			System.out.println("Maior = " + a);
		} else if (b > c) {
			System.out.println("Maior = " + b);
		} else {
			System.out.println("Maior = " + c);
		}
		
		showResult(higer);


		xp.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;

	}
	
	public static void showResult(int value) {
		System.out.println("Higer = " + value);
	}
}
