package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula41 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xy = new Scanner(System.in);

		double price, discount;
		price = 400.00;
		discount = 0;

		if (price < 200.00) {
			discount = price * 0.1;

		} else {
			discount = 0;
		}

		System.out.println(discount);

		xy.close();
	}
}
