package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula45 {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner p = new Scanner(System.in);
		
		double x, y;
		x = 0;
		y = 4;
		
		while ( x < 3 ) {
			y = y+2;
			x = x+1;
			
			System.out.println(x + " - " + y);
		}
		
		
		
		
		p.close();
	}

}
