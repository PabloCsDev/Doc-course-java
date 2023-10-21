package a64_Application;

public class Program {
	
	public static void main (String [] args) {
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			double xA, xB, xC, yA, yB, yC;

			System.out.println("Digite o valor dos lados A, B e C do triangulo X: ");
			xA = sc.nextDouble();
			xB = sc.nextDouble();
			xC = sc.nextDouble();
			System.out.println();

			System.out.println("Digite o valor dos lados A, B e C do triangulo y: ");
			yA = sc.nextDouble();
			yB = sc.nextDouble();
			yC = sc.nextDouble();
			System.out.println();

			double p = (xA + xB + xC) / 2.0;
			double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

			p = (yA + yB + yC) / 2.0;
			double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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

}
