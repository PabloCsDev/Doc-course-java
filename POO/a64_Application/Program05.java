package a64_Application;

import java.util.Locale;
import java.util.Scanner;

import a64_Entities.P05_Student;

public class Program05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		P05_Student std = new P05_Student();

		System.out.println("What's your name: ");
		std.name = sc.nextLine();
		System.out.println("What is the number of your registration?: ");
		std.registrationNumber = sc.nextInt();
		System.out.println("Enter your 1st, 2nd and 3rd unit notes ");

		std.note1 = sc.nextDouble();
		if (std.note1 < 0) {
			System.out.println("Invalid note, please try again");
		} 
		
		else if (std.note1 > 30) {
			System.out.println("The maximum grade of the unit 1st is 30 points. Please try again !");
		}

		std.note2 = sc.nextDouble();
		if (std.note2 < 0) {
			System.out.println("Invalid note, please try again");
		}

		else if (std.note2 > 35) {
			System.out.println("The maximum grade of the unit 2nd is 35 points. Please try again !");
		}

		std.note3 = sc.nextDouble();

		if (std.note3 < 0) {
			System.out.println("Invalid note, please try again");
		} else if (std.note3 > 35) {
			System.out.println("The maximum grade of the unit 3rd is 35 points. Please try again !");
		}

		else if (std.result() >= 60) {
			System.out.println();
			System.out.println(std.name + " - " + std.registrationNumber);
			System.out.println("Note Final = " + std.result());
			System.out.println("APPROVED");

		} else {
			System.out.println();
			System.out.println(std.name + " - " + std.registrationNumber);
			System.out.println("Note Final = " + std.result());
			System.out.println("FAILED");
			System.out.println("MISSED = " + std.failed() + " POINTS.");

		}

		sc.close();

	}
}