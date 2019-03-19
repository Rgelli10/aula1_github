package application;

import javax.swing.JOptionPane;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {

		double amount;
		
		try {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("Enter account data: \n\n", " Number: "));
		String holder = JOptionPane.showInputDialog("Enter account data: \n\n", " name: ");
		double balance = Integer.parseInt(JOptionPane.showInputDialog("Enter account data: \n\n", " Balance: "));
		double withdrawLimit = Integer.parseInt(JOptionPane.showInputDialog("Enter account data: \n\n", " Withdraw Limit: "));
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		
		do {
			amount = Integer.parseInt(JOptionPane.showInputDialog("Whitdraw: \n\n", "Enter amount for withdraw: "));
			
			try {
				acc.withdraw(amount);		
			} catch (DomainException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} catch (RuntimeException e) {			
				JOptionPane.showMessageDialog(null, "Até logo.");
			}
			
		} while (amount > balance); 
		 
		JOptionPane.showMessageDialog(null, "New Balance: " + acc.getBalance());
		}catch (RuntimeException e) {
		JOptionPane.showMessageDialog(null, "Operação Cancelada.");
	}
		
		// double deposit = Integer.parseInt(JOptionPane.showInputDialog(""));
		// acc.deposit(deposit);
		// JOptionPane.showMessageDialog(null, "New Balance: " + acc.getBalance());
		
	}

}
