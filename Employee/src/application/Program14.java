package application;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import entities.Emplyoee2;

public class Program14 {

	public static void main(String[] args) {

		List<Emplyoee2> list = new ArrayList<>();

		int n = Integer.parseInt(JOptionPane.showInputDialog("How many employees will be registered? "));

		for (int i = 0; i < n; i++) {
			JOptionPane.showMessageDialog(null, "Empolyee #" + i + ": ");

			String name = JOptionPane.showInputDialog("Insert your name: ");
			int id = Integer.parseInt(JOptionPane.showInputDialog("Insert to ID: "));
			double salary = Integer.parseInt(JOptionPane.showInputDialog("Insert to salary: "));

			list.add(new Emplyoee2(name, id, salary));
		}

		int id = Integer
				.parseInt(JOptionPane.showInputDialog("Enter the emplyoee id that will have salary increase? "));
		Emplyoee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		JOptionPane.showMessageDialog(null, emp);

		if (emp == null) {
			JOptionPane.showMessageDialog(null, "This id does not exist!");
		} else {
			double percentage = Integer.parseInt(JOptionPane.showInputDialog("Enter the percentage:"));
			emp.increaseSalary(percentage);
		}
		for (Emplyoee2 obj : list) {
			JOptionPane.showMessageDialog(null, "List of Employees: " + obj);
		}
	}

}
