package application;

import javax.swing.JOptionPane;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Triangle x = new Triangle ();
		Triangle y = new Triangle ();
		
		
		x.a = Integer.parseInt(JOptionPane.showInputDialog("Enter the measures of triangle X: "));
		x.b = Integer.parseInt(JOptionPane.showInputDialog("Enter the measures of triangle X: "));
		x.c = Integer.parseInt(JOptionPane.showInputDialog("Enter the measures of triangle X: "));
		
		y.a = Integer.parseInt(JOptionPane.showInputDialog("Enter the measures of triangle Y: "));
		y.b = Integer.parseInt(JOptionPane.showInputDialog("Enter the measures of triangle Y: "));
		y.c = Integer.parseInt(JOptionPane.showInputDialog("Enter the measures of triangle Y: "));
		
		double areaX = x.area();
		double areaY = y.area();
		
		JOptionPane.showMessageDialog(null, String.format(" Triangle X area: %.4f", areaX));
		JOptionPane.showMessageDialog(null, String.format(" Triangle Y area: %.4f", areaY));
		
		if(areaX>areaY) {
			JOptionPane.showMessageDialog(null, "Langer area: X " );
		}else
			JOptionPane.showMessageDialog(null, "Langer area: Y " );
	}

}
