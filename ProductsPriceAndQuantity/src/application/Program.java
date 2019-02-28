package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Products;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Products products = new Products();

		products.name = JOptionPane.showInputDialog("Enter product name: ");
		products.price = Integer.parseInt(JOptionPane.showInputDialog(null, "Price"));
		products.quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity in stock: "));

		
		
		JOptionPane.showMessageDialog(null, "Product data: " + products.toString());
		int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of products to be added in stock: "));
		
		products.addProducts(quantity);
		
		JOptionPane.showMessageDialog(null, "Update data: " + products.toString());
		
		JOptionPane.showInputDialog("Enter the number of products to be removed in stock: ");
		products.removeProductsquantity(quantity);
		JOptionPane.showMessageDialog(null, "" + products.toString());
		
		
	}
}
