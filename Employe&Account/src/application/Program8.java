package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Account;

public class Program8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Account account;
		
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter account number: "));
		String holder = JOptionPane.showInputDialog(null, "Enter account holder: ");
		int response = JOptionPane.showConfirmDialog(null, "Is there an initial deposit");
		
		
		if(response == 0) {
			double initialDeposit = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter initial deposit value: "));
			account = new Account (number, holder, initialDeposit);
			
		}else {
			account = new Account (number, holder);
		}
		
		JOptionPane.showMessageDialog(null, "Account data: " + account);
		
		double depositValue = Integer.parseInt(JOptionPane.showInputDialog("Enter a deposit value: "));
		account.deposit(depositValue);
		JOptionPane.showMessageDialog(null, "Updated account data: " + account);
		
		double withDrawValue = Integer.parseInt(JOptionPane.showInputDialog("Enter a whithdraw value: "));
		account.withdraw(withDrawValue);
		JOptionPane.showMessageDialog(null, "Updated account data: " + account);
		
	}

}
