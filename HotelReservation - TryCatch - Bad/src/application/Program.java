package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

		import model.entities.Reservation;

		public class Program {

			public static void main(String[] args) throws ParseException {

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				
				int number = Integer.parseInt(JOptionPane.showInputDialog("Room Number: "));
				Date checkIn = sdf.parse(JOptionPane.showInputDialog("CheckIn (dd/MM/yyyy)"));
				Date checkOut = sdf.parse(JOptionPane.showInputDialog("CheckOut (dd/MM/yyyy)"));
				
				if (!checkOut.after(checkIn)) {
					JOptionPane.showMessageDialog(null, "Error in reservation: Check-Out date must be after check-in data.");
				}
				else {
					Reservation reservation = new Reservation(number, checkIn, checkOut);
					
					JOptionPane.showMessageDialog(null, " Reservation: " + reservation);
					
					checkIn = sdf.parse(JOptionPane.showInputDialog("Check-In data (dd/MM/yyyy): "));
					checkOut = sdf.parse(JOptionPane.showInputDialog("Check-Out data (dd/MM/yyyy): "));
					
				String error = reservation.updateDate(checkIn, checkOut);
				if(error != null) {
					JOptionPane.showMessageDialog(null, "Error in reservation " + error);
				}else {
					JOptionPane.showMessageDialog(null, "Reservation: " + reservation);
				}
				
				
			}

		}

}
