package application;

import javax.swing.JOptionPane;

public class ProgramDoWhile {

	public static void main(String[] args) {

		int confirm;

		do {
			int user = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
			double squarderaiz = Math.sqrt(user);
			JOptionPane.showMessageDialog(null, String.format("Squarde Raiz is: %.3f", squarderaiz));

			confirm = JOptionPane.showConfirmDialog(null, "You go digit many numbers?");

		} while (confirm == 0);

	}

}
