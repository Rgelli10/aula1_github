package entities;

import javax.swing.JOptionPane;

public class Student {

	public String name;
	public double points;

	public double sumPoints(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}

	public void sum(double sum) {

		if (sum < 60.0) {
			double missing = 60.0 - sum;
			JOptionPane.showMessageDialog(null, "Failed \n" + "Missing " + missing + " Points");

		} else {
			JOptionPane.showMessageDialog(null, "Pass");
		}

	}

}
