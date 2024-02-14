package exerciciosA34;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo34 {
		public static void main (String[] args) {
			Locale.setDefault(Locale.US);
			Scanner xy = new Scanner(System.in);
			double n;
			
			System.out.println("Digite um numero entre 0 e 100 : ");
			n = xy.nextDouble();
			
			if ( n >= 0 && n < 25 ) {
				System.out.println( n + " esta no intervalo entre [0,25]");
			} 
			else if ( n >= 25 && n <= 50 ) {
				System.out.println(n + " esta no intervalo entre [25,50] !");
			} else if (n > 50 && n <= 75 ) {
				System.out.println(n + " esta no intervalo entre [50,75] !");
			} else if ( n > 75 && n <= 100) {
				System.out.println(n + " esta no intervalo entre [75,100] ! ");
			} else {
				System.out.println(" ERROR: Numero Invalido! ");
			}
			
			xy.close();
		}
}
