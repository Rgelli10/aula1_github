package application;

import java.util.Locale;

import javax.swing.JOptionPane;

public class ProgramBasic {
	
	public static void main ( String [] args) {
		Locale.setDefault(Locale.US);
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insert a number peapole: "));
		double [] vect = new double [n];
		
		for (int i=0; i<n; i++) {
			vect[i] = Integer.parseInt(JOptionPane.showInputDialog("Insert array: "));
			
		}
		
			double sum = 0;
			for (int i=0; i<n; i++) {
				sum += vect[i];
			}
			
			double media = sum/n;
			JOptionPane.showMessageDialog(null, "M�dia: " + media);
	
			
	
		
	}
	
}
