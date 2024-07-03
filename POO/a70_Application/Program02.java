package a70_Application;
 
import java.util.Locale;
import java.util.Scanner;

import a70_Util.P02_Calculator;

public class Program02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		final double radius = sc.nextDouble();

		double c = P02_Calculator.circumference(radius);

		double v = P02_Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", P02_Calculator.PI);
		
		
		sc.close(); 

}
}
