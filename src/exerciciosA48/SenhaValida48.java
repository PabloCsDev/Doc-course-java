package exerciciosA48;

import java.util.Locale;
import java.util.Scanner;

public class SenhaValida48 {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner p = new Scanner(System.in);
		
		int x,s;
		s = 0;
		x = 2002;
		
		System.out.println("Digite sua senha de 4 numeros: ");
		s = p.nextInt();
		
		while ( s != x) {
			System.out.println(" Senha invalida. Tente novamente: ");
			System.out.println("Digite a senha: ");
			s = p.nextInt();
			
		}
		
		System.out.println("Acesso Permitido");

		
		p.close();
}
}