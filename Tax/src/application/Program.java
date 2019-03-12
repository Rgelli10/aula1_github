package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Individual;
import entities.LegalPerson;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {

		List<PhysicalPerson> list = new ArrayList<>();

		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tax payers: "));

		for (int i = 1; i <= n; i++) {
			JOptionPane.showMessageDialog(null, "Tax payer #" + i + " data:");
			int ioc = JOptionPane.showConfirmDialog(null, "Are you company? otherwise you are individual. ");
			String name = JOptionPane.showInputDialog("Name: ");
			double annualIncome = Integer.parseInt(JOptionPane.showInputDialog("Annual Income: "));

			if (ioc == 0) {
				int employeeNumber = Integer.parseInt(JOptionPane.showInputDialog("Number of employees: "));
				if (employeeNumber > 10) {
					list.add(new LegalPerson(name, annualIncome, employeeNumber));
				}
			}
			if (ioc == 1) {
				double healthExpenses = Integer.parseInt(JOptionPane.showInputDialog("Health Expenses: "));
				if (annualIncome > 20000.0) {
					list.add(new Individual(name, annualIncome, healthExpenses));
				}
			}
		}
		double sum = 0.0;
		for (PhysicalPerson pp : list) {
			double tax = pp.tax();
			JOptionPane.showMessageDialog(null, "         TAXES PAID \n\n" + pp.toString());
			sum += tax;
		}

		JOptionPane.showMessageDialog(null, "      TOTAL TAXES: $ \n\n" + String.format("%.2f", sum));
	}

}
