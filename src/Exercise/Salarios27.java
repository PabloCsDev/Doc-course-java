package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class Salarios27 {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner (System.in);
		
		String name;
		int nf, vh;
		double ht, salario;
		vh = 15;
		
		
		System.out.println(" Qual o nome do senhor? ");
		name = xp.nextLine();
		System.out.println();
		
		System.out.println("Informe seu numero de funcionario: ");
		nf = xp.nextInt();
		System.out.println();
		
		System.out.println("Agora infome o total de horas trabalhadas: ");
		ht = xp.nextDouble();
		System.out.println();
		
		salario = ht * vh;
		
		System.out.printf(name + " ,o senhor funcionario numero " + nf + " trabalhou "
				+ ht + " horas .Como a empresa paga U$ " + vh + " pela hora trabalhada o senhor ira receber um salario de: U$ " + salario);

		
		xp.close();
		
	}

}
