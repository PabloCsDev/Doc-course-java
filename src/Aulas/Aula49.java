package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula49 {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner (System.in);
	
		int N, soma;
		soma = 0;
		
		System.out.println("Digite um numero: ");
		N = xp.nextInt();
		
		for ( int i=0; i<N; i++) {
			int x = xp.nextInt();
			soma = soma + x;
		}

		System.out.println(soma);
		
		xp.close();
	}
}
