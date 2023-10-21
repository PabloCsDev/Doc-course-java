package aulas;

public class Aula40 { 
	public static void main (String [] args) {
		double preco, desconto;
		preco = 34.5;
		desconto = ( preco < 20.0 ) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
	} 
}
