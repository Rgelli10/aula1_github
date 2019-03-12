package application;

import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws HeadlessException, ParseException {

		List<Product> list = new ArrayList<>();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of products: "));

		for (int i = 1; i <= n; i++) {
			int imp = JOptionPane.showConfirmDialog(null, "Your product is imported? ");
			int used = JOptionPane.showConfirmDialog(null, "Your product is Used? ");
			JOptionPane.showMessageDialog(null, "Product #" + i + " data: ");
			String name = JOptionPane.showInputDialog("Name: ");
			double price = Integer.parseInt(JOptionPane.showInputDialog("Price: "));

			if (imp == 0) {
				double customsFee = Integer.parseInt(JOptionPane.showInputDialog("Customs fee: "));
				list.add(new ImportedProduct(name, price, customsFee));
			}

			if (used == 0) {
				Date manufactureDate = df.parse(JOptionPane.showInputDialog("Manufacture Date: DD/MM/YYYY"));
				list.add(new UsedProduct(name, price, manufactureDate));
			}

			if (used == 1 && imp == 1) {
				list.add(new Product(name, price));
			}

		}

		for (Product prod : list) {
			JOptionPane.showMessageDialog(null, "         PRICE TAGS: \n\n\n" + prod.priceTag());
		}
	}

}
