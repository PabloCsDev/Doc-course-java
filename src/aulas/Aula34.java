package aulas;

import java.util.Scanner;

public class Aula34 {
	public static void main(String[] args) {
		Scanner xy = new Scanner (System.in);
		int hora;
		
		System.out.println("Que horas são?");
		hora = xy.nextInt();
		
		if ( hora < 12 ) {
			System.out.println("Bom Dia!");
		}
		else if ( hora < 18) {
			System.out.println("Boa Tarde!");
		} 
		
		else {
			System.out.println("Boa Noite");
		}
		
		xy.close();
	}

}
