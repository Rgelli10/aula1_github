package application;

import javax.swing.JOptionPane;

public class Program12 {

	public static void main(String[] args) {

		String [] vect = new String [] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i<vect.length; i++) {
			JOptionPane.showMessageDialog(null, vect[i]);
		}
		
		for(String obj : vect) {
			JOptionPane.showMessageDialog(null, obj);
		}
	}

}
