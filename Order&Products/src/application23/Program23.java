package application23;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import entities.enums23.OrderStatus;
import entities23.Client;
import entities23.Order;
import entities23.OrderItem;
import entities23.Product;

public class Program23 {

	public static void main(String[] args) throws HeadlessException, ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		
		String name = JOptionPane.showInputDialog("Name: ");
		String email = JOptionPane.showInputDialog("E-Mail:");
		Date brithDate = sdf.parse(JOptionPane.showInputDialog("Birth Date: "));
		
		Client client = new Client (name, email, brithDate);

		OrderStatus status = OrderStatus.valueOf(JOptionPane.showInputDialog("Status: "));

		Order order = new Order (new Date(), status, client);
		

		int n = Integer.parseInt(JOptionPane.showInputDialog("How many items to this order: "));

		for (int i = 0; i < n; i++) {
			String productName = JOptionPane.showInputDialog("Product name: ");
			double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Product price: "));
			
			Product product = new Product (productName, productPrice);
			
			int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity: "));
			
			OrderItem orderItem = new OrderItem (quantity, productPrice, product);

			order.addItem(orderItem);
			
		}
		
		JOptionPane.showMessageDialog(null, "Order Summary: /n/n" + order);
	}

}
