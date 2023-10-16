package ExerciciosA48;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel48 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int alcool, gasolina, diesel, tipo;
		alcool = 0;
		gasolina = 0;
		diesel = 0;

		System.out.print("Digite o código do combustível ou dos combustiveis que o voce abasteceu:\n");
		System.out.print("1 para Álcool\n");
		System.out.print("2 para Gasolina\n");
		System.out.print("3 para Diesel\n");
		System.out.print("0 para finalizar o chat apos escolher sua opcao de combustivel:\n");

		tipo = sc.nextInt();

		while (tipo != 0) {
			if (tipo == 1) {
				alcool = alcool + 1;
				System.out.println("Voce abasteceu Alcool: " + alcool);
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
				System.out.println("Voce abasteceu Gasolina: " + gasolina);
			} else if (tipo == 3) {
				diesel = diesel + 1;
				System.out.println("Voce abasteceu Diesel: " + diesel);
			}

			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		
		sc.close();
	}
}
