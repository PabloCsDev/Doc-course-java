package a64_Application;

import java.util.Locale;
import java.util.Scanner;

import a64_Entities.P02_Product;

public class Program02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		P02_Product product = new P02_Product();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();

		System.out.println();

		System.out.printf("Product data: " + "\n" + product);
		System.out.println("\n" + "Enter the number of products to be added in stock: " + "\n");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Update data : " + "\n" + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: " + "\n");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Update data : " + "\n" + product);

		sc.close();

	}

}
