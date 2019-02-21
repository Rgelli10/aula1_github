
	import javax.swing.JOptionPane;

	public class whilefor {

		public static void main(String [] args) {
			
			int x = 0;	
			int z = Integer.MAX_VALUE;
			int result = z;
			
			
		int n = Integer.parseInt(JOptionPane.showInputDialog("How many numbers are you going to type? "));
		
		while( n<=0 ) {
			JOptionPane.showMessageDialog(null, "N must be positive! Try again:" + n);
			n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number integer: "));
			
		}
		
		for (int i = 1; i<=n; i++) {
			JOptionPane.showMessageDialog(null, "Value #" + i +": ");
			
			 x = Integer.parseInt(JOptionPane.showInputDialog(" "));
			 
			 result = x;
		}
		
		JOptionPane.showMessageDialog(null, "Higher is: " + result);
		}
		
		
	}


