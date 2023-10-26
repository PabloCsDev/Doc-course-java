package a70_Util;

public class P02_Calculator {
	
	public final double PI = 3.14159;
	
	public  double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public  double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
