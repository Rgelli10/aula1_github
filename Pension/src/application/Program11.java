package application;

import javax.swing.JOptionPane;

import entities.Pension;

public class Program11 {

	public static void main(String[] args) {

		Pension[] vect = new Pension[5];

		for (int i = 0; i < vect.length; i++) {
			JOptionPane.showMessageDialog(null, "Rent #" + i + ":");

			String name = JOptionPane.showInputDialog("Insert student name: ");
			String eMail = JOptionPane.showInputDialog("Insert student E-Mail");
			int room = Integer.parseInt(JOptionPane.showInputDialog("Insert room: "));

			vect[room] = new Pension(name, eMail);
		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				JOptionPane.showMessageDialog(null, i + ": " + vect[i] + "hotmail.com");
			}
		}
	}

}
