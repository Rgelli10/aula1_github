package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

		import model.entities.Reservation;
import model.exception.DomainException;

		public class Program {

			public static void main(String[] args)  {

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
			try {	
				int number = Integer.parseInt(JOptionPane.showInputDialog("Room Number: "));
				Date checkIn = sdf.parse(JOptionPane.showInputDialog("CheckIn (dd/MM/yyyy)"));
				Date checkOut = sdf.parse(JOptionPane.showInputDialog("CheckOut (dd/MM/yyyy)"));
				
			
				Reservation reservation = new Reservation(number, checkIn, checkOut);
				
				JOptionPane.showMessageDialog(null, " Reservation: " + reservation);
				
				checkIn = sdf.parse(JOptionPane.showInputDialog("Check-In data (dd/MM/yyyy): "));
				checkOut = sdf.parse(JOptionPane.showInputDialog("Check-Out data (dd/MM/yyyy): "));
				
			reservation.updateDate(checkIn, checkOut);
				JOptionPane.showMessageDialog(null, "Reservation: " + reservation);
			
			}
			catch(ParseException e) {
				JOptionPane.showMessageDialog(null, "Invalid date format. ");
			}
			catch (DomainException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			catch (RuntimeException e) {
				JOptionPane.showMessageDialog(null, "Unexpected error. ");
			}
			
		}

}
