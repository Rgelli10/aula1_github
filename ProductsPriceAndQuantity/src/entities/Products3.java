package entities;

public class Products3 {
	
	private String name;
	private double price;
	private int quantity;
	
	public Products3 () {
		
	}
	
	public Products3 (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price*quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProductsquantity(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		 return name
				 +", $ "
				 + String.format("%.2f", price)
				 +", "
				 + quantity
				 + " units, Total: $ "
				 + totalValueInStock();
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice (double price) {
		this.price = price;
	}
	
	public int getQuantity () {
		return quantity;
	}
}
