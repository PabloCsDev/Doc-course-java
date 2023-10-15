package Aulas;

public class Aula40 {
	public static void main (String [] args) {
		double preco, desconto;
		preco = 34.5;
		
		if ( preco < 20.00 ) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
	}
}
