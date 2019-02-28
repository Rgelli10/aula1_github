package application;

import javax.swing.JOptionPane;

import entities.Products2;

public class Program10 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Insert integer number: "));
		Products2 [] vect = new Products2 [n];
		
		for (int i = 0; i<vect.length; i++) {
		String name = JOptionPane.showInputDialog("Insert name: ");
		double price = Integer.parseInt(JOptionPane.showInputDialog("Insert price: "));
		vect [i]= new Products2 (name, price);
		}
		
		double sum = 0;
		for(int i = 0; i<vect.length; i++) {
		sum += vect[i].getPrice();
		}
		
		double avg = sum/vect.length;
		
		JOptionPane.showMessageDialog(null, "Averade Price: " + avg);
	}

}
