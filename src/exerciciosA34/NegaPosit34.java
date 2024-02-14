package exerciciosA34;

import java.util.Scanner;

public class NegaPosit34 {
	public static void main (String[] args) {
		Scanner xy = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero entre -100 e 100");
		num = xy.nextInt();
		
		if ( num < 0 ) {
			System.out.println( num + " é um numero negativo!");
		} else {
			System.out.println(num + " é um numero positivo!");
		}
		
		xy.close();
	}
}
