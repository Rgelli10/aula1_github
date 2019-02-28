package application;

import javax.swing.JOptionPane;

public class ProgramArray {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog(""));
		int[][] mat = new int[n][n];

		for (int i = 0; i <mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog(""));
			}

		}

		JOptionPane.showMessageDialog(null, "Main diagonal: ");
		for (int i = 0; i <mat.length; i++) {
			JOptionPane.showMessageDialog(null, mat[i][i]);
		}
		

		int count = 0;
		for (int i = 0; i <mat.length; i++) {
			for (int j = 0; j <mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count ++;	
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, count);
	}

}
