package a64_Entities;

public class P05_Student {
	
	public String name;
	public int registrationNumber;
	public double note1;
	public double note2;
	public double note3;
	
	public double result () {
		return note1 + note2 + note3;
	}
	
	
	public double failed() {
		return 60 - result();
	}

}
