package application;

import javax.swing.JOptionPane;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {

		try {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter account data: \n\n", " Number: "));
		String holder = JOptionPane.showInputDialog("Enter account data: \n\n", " name: ");
		double balance = Integer.parseInt(JOptionPane.showInputDialog("Enter account data: \n\n", " Balance: "));
		double withdrawLimit = Integer.parseInt(JOptionPane.showInputDialog("Enter account data: \n\n", " Withdraw Limit: "));
		
		Account acc = new Account(number, holder, balance, withdrawLimit);

	
		double amount = Integer.parseInt(JOptionPane.showInputDialog("", "Enter amount for withdraw: "));
		 acc.withdraw(amount);
		JOptionPane.showMessageDialog(null, "New Balance: " + acc.getBalance());
		
		// double deposit = Integer.parseInt(JOptionPane.showInputDialog(""));
		// acc.deposit(deposit);
		// JOptionPane.showMessageDialog(null, "New Balance: " + acc.getBalance());
		
		}catch (DomainException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		}catch (RuntimeException e) {			
			JOptionPane.showMessageDialog(null, "Até logo.");
		}
		
		
		
	}

}
