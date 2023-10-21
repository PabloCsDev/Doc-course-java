package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula56 { /* OPEREACOES BITWISE */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		int n1;
		int n2;

		System.out.println("Digite um numero: ");
		n1 = xp.nextInt();
		System.out.println("Digite outro numero: ");
		n2 = xp.nextInt();
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

		xp.close();
	}

}
