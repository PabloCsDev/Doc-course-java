package a64_Entities;

public class P02_Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + "\n" + "$" + String.format("%.2f", price, ".") + "\n" + quantity + " Units." + "\n" + "Total : $"
				+ String.format("%.2f", totalValueInStock());
	}
}