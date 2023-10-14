package ExerciciosA27;

import java.util.Locale;
import java.util.Scanner;

public class Areas27 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		double A, B, C, pi, areaTri, areaTra, areaCir, areaRet, areaQua;
		pi = 3.14159;

		System.out.println(" Informe um valor para o lado A: ");
		A = xp.nextDouble();
		System.out.println();

		System.out.println(" Informe um valor para o lado B: ");
		B = xp.nextDouble();
		System.out.println();

		System.out.println(" Informe um valor para o lado C: ");
		C = xp.nextDouble();
		System.out.println();

		areaTri = A * C / 2;
		areaCir = pi * Math.pow(C, 2.0);
		areaTra = ((A + B) / 2) * C;
		areaQua = Math.pow(B, 2.0);
		areaRet = A * B;

		System.out.printf(" A área do triângulo retângulo que tem A por base e C por altura é igual a: %.3f%n",
				areaTri);
		System.out.printf(" A área do círculo de raio C é igual a: %.3f%n", areaCir);
		System.out.printf(" A área do trapézio que tem A e B por bases e C por altura é igual a: %.3f%n", areaTra);
		System.out.printf(" A área do quadrado que tem lado B é igual a: %.3f%n", areaQua);
		System.out.printf(" A  área do retângulo que tem lados A e B é igual a: %.3f%n", areaRet);

		xp.close();
	}

}
