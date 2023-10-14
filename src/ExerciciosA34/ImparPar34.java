package ExerciciosA34;

import java.util.Scanner;

public class ImparPar34 {
	
		public static void main (String[] args) {
			Scanner xy = new Scanner(System.in);
			int num;
			
			System.out.println("Digite um numero");
			num = xy.nextInt();
			
			if ( num % 2 ==0   ) { 
				System.out.println( num + " é um numero PAR!");
			} else {
				System.out.println(num + " é um numero IMPAR!");
			}
			
			xy.close();
		}
	}

