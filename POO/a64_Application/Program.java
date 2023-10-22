package a64_Application;

import java.util.Locale;
import java.util.Scanner;

import a64_Entities.Triangle;

public class Program {
	
	public static void main (String [] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			
			Triangle x, y;
			x = new Triangle();
			y = new Triangle();

			System.out.println("Digite o valor dos lados A, B e C do triangulo X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			System.out.println();

			System.out.println("Digite o valor dos lados A, B e C do triangulo y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			System.out.println();

			double p = (x.a + x.b + x.c) / 2.0;
			double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

			p = (y.a + y.b + y.c) / 2.0;
			double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

			System.out.printf("A area do triangulo X é: %.4f%n", areaX);
			System.out.printf("A area do triangulo Y é: %.4f%n", areaY);

			if (areaX > areaY) {
				System.out.println("Maior area: X");
			} else {
				System.out.println("Maior area: Y");
			}

			sc.close();
		}


	}


