package application;

import javax.swing.JOptionPane;

public class ProgramForArray {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog(""));
		int m = Integer.parseInt(JOptionPane.showInputDialog(""));
		int[][] mat = new int[n][m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat [i].length; j++) {
				mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, ""));
			}

		}
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("x: "));
		
		for (int i = 0; i< mat.length; i++) {
			for (int j = 0; j< mat[i].length; j++) {
				
				if (mat [i][j] == x) {
					JOptionPane.showMessageDialog(null, "Position " + i + "," + j + ":");
					
					if (j > 0) {
						JOptionPane.showMessageDialog(null,"Left: " + mat[i][j-1]);
					}
					if (j < mat[i].length - 1) {
						JOptionPane.showMessageDialog(null,"Right: " + mat[i][j+1]);
					}
					if (i > 0) {
						JOptionPane.showMessageDialog(null,"Up: " +  mat[i-1][j]);
					}
					if (i < mat.length - 1) {
						JOptionPane.showMessageDialog(null, "Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
	}

}
