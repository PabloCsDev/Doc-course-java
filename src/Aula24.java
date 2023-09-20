/* PROCESSAMENTO DE DADOS - CASTING */

public class Aula24 {
    public static void main(String[] args) {
        exemplo1();
        exemplo2();
        exemplo3();
    }

    public static void exemplo1() {
        int x;
        double y;
        x = 5;
        y = 2 * x;

        System.out.println("O valor de x é " + x);
        System.out.println("O valor de y é " + y);
    }

    public static void exemplo2() {
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);
    }
    
    public static void exemplo3() {
    	int a, b;
    	double resultado;
    	
    	a = 5;
    	b = 2;
    	
    	resultado = (double) a / b; /* CASTING */
    	
    	System.out.println(resultado);
    }
} 
