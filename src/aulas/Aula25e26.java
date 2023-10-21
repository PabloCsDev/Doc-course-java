/* ENTRADA-LEITURA DE DADOS */
package aulas;

import java.util.Locale;

import java.util.Scanner;

public class Aula25e26 {

	public static void main(String[] args) {
		exemplo1();
		exemplo2();
	}

	public static void exemplo1() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char w;

		System.out.println(" Digite seu nome: ");
		x = sc.next();
		System.out.println();

		System.out.println(" Digite um numero inteiro: ");
		y = sc.nextInt();
		System.out.println();

		System.out.println(" Digite um numero quebrado: ");
		z = sc.nextDouble();
		System.out.println();

		System.out.println(" Digite seu sex M/F: ");
		w = sc.next().charAt(0);
		System.out.println();

		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y + " anos ");
		System.out.println(z);
		System.out.println(" sex: " + w);

		System.out.println();

	}

	/* LER ATE A QUEBRA DE LINHA */

	public static void exemplo2() {

		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;
		int x;

		System.out.println(" Digite um numero: ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.println();

		System.out.println(" Digite um nome: ");
		s1 = sc.nextLine();
		System.out.println();

		System.out.println(" Digite um nome: ");
		s2 = sc.nextLine();
		System.out.println();

		System.out.println(" Digite um nome: ");
		s3 = sc.nextLine();
		System.out.println();

		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}
}
