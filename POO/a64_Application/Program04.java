package a64_Application;

import java.util.Locale;

import java.util.Scanner;

import a64_Entities.P04_Employee;

public class Program04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		P04_Employee emp = new P04_Employee();

		System.out.println("Enter your first and last name: " + "\n");
		emp.name = sc.nextLine();
		System.out.println("Report your gross salary: " + "\n");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Enter the tax amount: " + "\n");
		emp.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + emp.name + "\n");
		System.out.println();
		System.out.println("Net Salary: $" + emp.netSalary());
		System.out.println("Which percentage to increase salary?" + "\n");
		double porcentage = sc.nextDouble();
		emp.increaseSalary(porcentage);

		System.out.println();
		System.out.println("Update data: " + emp);

		sc.close();

	}
}