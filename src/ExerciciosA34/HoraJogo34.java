package ExerciciosA34;

import java.util.Scanner;

public class HoraJogo34 {
	public static void main (String[] args) {
		Scanner xy = new Scanner(System.in);
		int I, F;
		int duracao;
		
		System.out.println("Digite a hora do INICIO do jog");
		I = xy.nextInt();
		
		System.out.println("Digite a hotra do FIANAL do jogo");
		F = xy.nextInt();
		
		if ( I < F ) { 
				duracao = 24 - F - I;
		} 
		else {
				duracao = 24 - I + F;
		}
		
		System.out.println(" O JOGO DUROU " + duracao + " HORAS(S)");
		
		xy.close();
	}
}
