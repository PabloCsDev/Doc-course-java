package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula57 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		int mask = 0b100000;
		
		System.out.println("Digite o um numero: ");
		int n = xp.nextInt();

		if (( n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		xp.close();
	}
}
