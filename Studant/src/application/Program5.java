package application;

import javax.swing.JOptionPane;

import entities.Student;

public class Program5 {

	public static void main(String[] args) {
		
		Student student = new Student ();
		
		student.name = JOptionPane.showInputDialog("Enter your name: ");
		double n1 = student.points = Integer.parseInt(JOptionPane.showInputDialog("What's your points in first avaliation?"));
		double n2 = student.points = Integer.parseInt(JOptionPane.showInputDialog("What's your points in second avaliation?"));
		double n3 = student.points = Integer.parseInt(JOptionPane.showInputDialog("What's your points in final avaliation?"));
		
		
		
		student.sumPoints(n1 ,n2, n3);
		
		JOptionPane.showMessageDialog(null, "Final Grade = " + student.sumPoints (n1,n2,n3));
		
		double sum = student.sumPoints(n1, n2, n3);
		
		student.sum(sum);
		
		
	}

}
