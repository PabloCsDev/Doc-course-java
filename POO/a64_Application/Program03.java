package a64_Application;

import java.util.Locale;
import java.util.Scanner;

import a64_Entities.P03_Rectangle;

public class Program03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		P03_Rectangle retangle = new P03_Rectangle();

		System.out.println("Enter rectangule width and height: ");
		retangle.width = sc.nextDouble();
		retangle.height= sc.nextDouble();
		
		System.out.println();

		double area = retangle.area();
		double perimeter = retangle.perimeter();
		double diagonal = retangle.diagonal();

		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Diagonal: " + diagonal);

		sc.close();
	}

}
