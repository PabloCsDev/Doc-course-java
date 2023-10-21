package aulas;

import java.util.Locale; 
import java.util.Scanner;

public class Aula38 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner xy = new Scanner(System.in);

		int n;
		String dia;

		System.out.println(" Informe o numero que representa o dia de hoje na semana " + ".Exemplo,domingo : 1");
		n = xy.nextInt();

		switch (n) {
		case 1:
			dia = "domingo";
			break;

		case 2:
			dia = "segunda";
			break;

		case 3:
			dia = "terca";
			break;

		case 4:
			dia = "quarta";
			break;

		case 5:
			dia = "quinta";
			break;

		case 6:
			dia = "sexta";
			break;

		case 7:
			dia = "sabado";
			break;
		
			default :
				dia = "Valor Invalido!";
				break;
			
		}
	
		System.out.println(" Dia da semana: " + dia);

		xy.close();

	}

}
