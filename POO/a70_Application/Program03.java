package a70_Application;

import java.util.Locale;
import java.util.Scanner;

import a70_Util.P03_CurrencyConverter;

public class Program03 {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US );
		Scanner sc = new Scanner (System.in);
		P03_CurrencyConverter conv = new P03_CurrencyConverter();
		
		System.out.println("Enter the dollar quote today: ");
		double doll = sc.nextDouble();

		System.out.println("Enter the value in reais of the amount you want to convert to dollars: ");
		double real = sc.nextDouble();
		
		double totalValue = conv.total(doll, real);
        double iofValue = conv.iof(totalValue); 
        double totalValueWithIOF = totalValue - iofValue;

		
		System.out.println("The value without the IOF fee looks like this: $" + totalValue);
		System.out.println("But with the MANDATORY IOF rate of 6%, the total value of the conversion is: $" + totalValueWithIOF);

		sc.close();
		
	}
}
