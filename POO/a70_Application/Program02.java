package a70_Application;

import java.util.Locale;
import java.util.Scanner;

import a70_Util.P02_Calculator;

public class Program02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		P02_Calculator calc = new P02_Calculator();
		
		System.out.print("Enter radius: ");
		final double radius = sc.nextDouble();

		double c = calc.circumference(radius);

		double v = calc.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		
		sc.close();

}
}
