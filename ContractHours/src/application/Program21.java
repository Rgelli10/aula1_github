package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program21 {

	public static void main(String[] args) throws  ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String departmentName = JOptionPane.showInputDialog("Enter departament's name: ");
		String workerName = JOptionPane.showInputDialog("Enter Worker data: Name - ");
		String workerLevel = JOptionPane.showInputDialog("Level: ");
		double baseSalary = Integer.parseInt(JOptionPane.showInputDialog("Base Salary: "));
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
	
	
		int n = Integer.parseInt(JOptionPane.showInputDialog("How many contracts to this worker? "));
		
		for(int i = 0; i<=n; i++) {
			JOptionPane.showMessageDialog(null, "Enter contract number " + i + " Data:");
			Date contractDate = sdf.parse(JOptionPane.showInputDialog("DD/MM/YYYY"));
			double valuePerHour = Integer.parseInt(JOptionPane.showInputDialog(null, "Value per hour: "));
			int hours = Integer.parseInt(JOptionPane.showInputDialog("Duration (Hours): "));
			
			HourContract contract = new HourContract (contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		String monthAndYear = JOptionPane.showInputDialog("Enter month and year to calculate income (MM/YYYY):");
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		JOptionPane.showMessageDialog(null, "Name: " + worker.getName());
		JOptionPane.showMessageDialog(null, "Departament: " + worker.getDepartment().getName());
		JOptionPane.showMessageDialog(null, "Income for " + monthAndYear + ": = " + String.format(" %.2f", worker.income(year, month)));
	}
}