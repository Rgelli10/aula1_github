
package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Products3;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		//Products1 p = new Products1();
		
		String name = JOptionPane.showInputDialog("Enter product name: ");
		double price = Integer.parseInt(JOptionPane.showInputDialog(null, "Price"));
	//	int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity in stock: "));
		
		Products3 products = new Products3(name, price);
	
		products.setName("Computer");
		JOptionPane.showMessageDialog(null, "Upadate name: " + products.getName());
		products.setPrice(1200);
		JOptionPane.showMessageDialog(null, "Update price: " + products.getPrice());
		
		
		JOptionPane.showMessageDialog(null, "Product data: " + products.toString());
		 int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of products to be added in stock: "));

		products.addProducts(quantity);

		JOptionPane.showMessageDialog(null, "Update data: " + products.toString());

		quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of products to be removed in stock: "));
		products.removeProductsquantity(quantity);
		JOptionPane.showMessageDialog(null, "" + products.toString());

	}
}
