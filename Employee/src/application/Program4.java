package application;

import javax.swing.JOptionPane;

import entities.Employee;

public class Program4 {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.name = JOptionPane.showInputDialog("What's your name? ");
		emp.grossSalary = Integer.parseInt(JOptionPane.showInputDialog("Insert your salary: "));
		emp.tax = Integer.parseInt(JOptionPane.showInputDialog("Tax: "));

		emp.netSalary();

		JOptionPane.showMessageDialog(null, "Employee: " + emp.name + ", " + "$, " + emp.grossSalary);

		double p = Integer.parseInt(JOptionPane.showInputDialog("Whitch percebtage to increase salary? "));

		emp.increaseSalary(p);

		JOptionPane.showMessageDialog(null, "Upadate data: " + emp.name + ", " + emp.grossSalary);

	}

}
