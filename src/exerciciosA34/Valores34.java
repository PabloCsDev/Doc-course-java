package exerciciosA34;

import java.util.Scanner;

public class Valores34 {
	public static void main (String[] args) {
		Scanner xy = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite um numero");
		A = xy.nextInt();
		
		System.out.println("Digite outro numero");
		B = xy.nextInt();
		
		if ( A % B == 0 || B % A == 0 ) { 
			System.out.println( A + " e " + B + " são numeros Multiplos!");
		} else {
			System.out.println( A + " e " + B + " não são numeros Multiplos!");
		}
		
		xy.close();
	}

}
