package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of employees"));

		for (int i = 1; i <= n; i++) {
			JOptionPane.showMessageDialog(null, "Employee #" + i + " data:");
			int ch = JOptionPane.showConfirmDialog(null, "Outsourced. Y/N? ");
			String name = JOptionPane.showInputDialog(null, "Employee name: ");
			int hours = Integer.parseInt(JOptionPane.showInputDialog(null, "Hours: "));
			double valuePerHour = Integer.parseInt(JOptionPane.showInputDialog(null, "Value per hour: "));

			if (ch == 0) {
				double additionalCharge = Integer.parseInt(JOptionPane.showInputDialog("Additional Charge"));
				Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);

			} else {
				/*Instanciando dentro do ADD, funciona do mesmo jeito que a instanciação anterior.*/
			list.add(new Employee(name, hours, valuePerHour));
			}
		}

		for(Employee emp: list) {
			JOptionPane.showMessageDialog(null, "         Payments: \n\n" 
			+ emp.getName() + "\n" + String.format("%.2f", emp.paymant()));
		}
	}

}
