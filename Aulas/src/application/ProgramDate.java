package application;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import java.text.SimpleDateFormat;
import java.time.Instant;

public class ProgramDate {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		JOptionPane.showMessageDialog(null, sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();

		JOptionPane.showMessageDialog(null, sdf.format(d));
		
		
		int minutes = cal.get(Calendar.MINUTE);
		
		JOptionPane.showMessageDialog(null, "Minutes: " + minutes);
		
		int month = cal.get(Calendar.MONTH);
		
		JOptionPane.showMessageDialog(null, "Month: " + month);
		
		int month2 = 1 + cal.get(Calendar.MONTH);
		
		JOptionPane.showMessageDialog(null, "Month Updated: " + month2);
		
	}

}
