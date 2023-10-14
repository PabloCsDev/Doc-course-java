package ExerciciosA27;

import java.util.Locale;
import java.util.Scanner;

public class Area27 {
	
	public static void main ( String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner xp = new Scanner (System.in);
		
		double pi = 3.14159;
		double raio;
		
		System.out.println("Informe o valor do raio do circulo:");
		raio = xp.nextDouble();
		raio = pi * Math.pow(raio ,2.0);
		
		System.out.printf("O valor da area é %.4f%n",raio );
	
		xp.close();
		
	}

}
