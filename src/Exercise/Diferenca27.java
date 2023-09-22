package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class Diferenca27 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		int A, B, C, D, Diferenca;

		System.out.println("Digite o valor do objeto A: ");
		A = xp.nextInt();
		System.out.println("Digite o valor do objeto B: ");
		B = xp.nextInt();
		System.out.println("Digite o valor do objeto C: ");
		C = xp.nextInt();
		System.out.println("Digite o valor do objeto D: ");
		D = xp.nextInt();

		Diferenca = (A * B - C * D);

		System.out.println(" A multplição de " + A + " e " + B + " é " + (A * B) + " ,e a multiplicação de " + C + " e "
				+ D + " é " + (C * D) + ".Portanto, a diferença de valor entre eles é igual a " + Diferenca + ".");

		xp.close();

	}

}
