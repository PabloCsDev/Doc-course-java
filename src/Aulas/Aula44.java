package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula44 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xy = new Scanner(System.in);

		int x, soma;
		soma = 0;

		System.out.println(
				"Digite os numeros para que o programa" + " faça a soma deles , para terminar o processo digite '0'"
						+ " e o programa ira mostrar a soma na tela:");
		x = xy.nextInt();

		while (x != 0) {
			soma = soma + x;
			x = xy.nextInt();
		}
		System.out.println("A soma dos numeros é igual a: " + soma);

		xy.close();
	}

}
