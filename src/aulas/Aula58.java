package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula58 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner xp = new Scanner(System.in);

		String original = "ABC  abc  XYZ  xyz";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(1);
		String s05 = original.substring(1, 7);
		String s06 = original.replace('a', 'x'); // troca um caractere por outro, use '' 
		String s07 = original.replace("abc", "AWS"); // troca uma string por outro, use "" 
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		String s = "potato,apple,lemon";
		String[] vect = s.split(",");

		System.out.println("Original: " + original);
		System.out.println("toLowerCase: " + s01);
		System.out.println();

		System.out.println("Original: " + original);
		System.out.println("toUpperCase: " + s02);
		System.out.println();

		System.out.println("Original: " + original);
		System.out.println("trim: " + s03);
		System.out.println();

		System.out.println("Original: " + original);
		System.out.println("substring(1): " + s04);
		System.out.println();

		System.out.println("Original: " + original);
		System.out.println("substring(1, 07): " + s05);
		System.out.println();

		System.out.println("Original: " + original);
		System.out.println("replace('a', 'x'): " + s06);
		System.out.println();

		System.out.println("Original: " + original);
		System.out.println("replace(\"abc\", \"AWS\"): " + s07);
		System.out.println();

		System.out.println("Original: " + original);
		System.out.println("indexOf(\"bc\"): " + i);
		System.out.println();

		System.out.println("Original: " + original);
		System.out.println("lastIndexOf(\"bc\"): " + j);
		System.out.println();

		System.out.println("s.split(\",\"): ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println();

		xp.close();
	}

}
