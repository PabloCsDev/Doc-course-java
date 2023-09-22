package Exercise;
import java.util.Scanner;

public class Soma27 {
	
	public static void main (String [] args) {
		
		Scanner xp = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int a, b, soma;
		a = xp.nextInt();
		
		System.out.println("Digite outro numero:");
		b = xp.nextInt();
		soma = a + b;
		
		System.out.println("A soma entre " + a + " é " + b + " é igual a: " + soma);
		

		xp.close();
		
	}

}
