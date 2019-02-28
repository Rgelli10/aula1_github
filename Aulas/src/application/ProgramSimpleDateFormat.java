package application;

import java.util.Date;
import java.util.TimeZone;

import javax.swing.JOptionPane;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class ProgramSimpleDateFormat {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date ();
		Date x2 = new Date (System.currentTimeMillis());
		Date x3 = new Date (0L);
		Date x4 = new Date (1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("21/02/2019");
		Date y2 = sdf2.parse("21/02/2019 09:29:07");
		Date y3 = Date.from(Instant.parse("2019-06-25t15:42:07Z"));
		
		
		
		JOptionPane.showMessageDialog(null, "y1: " + sdf2.format(y1));
		JOptionPane.showMessageDialog(null, "y2: " + sdf2.format(y2));
		JOptionPane.showMessageDialog(null, "y3: " + sdf2.format(y3));
		JOptionPane.showMessageDialog(null, "x1: " + sdf2.format(x1));
		JOptionPane.showMessageDialog(null, "x2: " + sdf2.format(x2));
		JOptionPane.showMessageDialog(null, "x3: " + sdf2.format(x3));
		JOptionPane.showMessageDialog(null, "x4: " + sdf2.format(x4));
		
		JOptionPane.showMessageDialog(null, "y1: " + sdf3.format(y1));
		JOptionPane.showMessageDialog(null, "y2: " + sdf3.format(y2));
		JOptionPane.showMessageDialog(null, "y3: " + sdf3.format(y3));
		JOptionPane.showMessageDialog(null, "x1: " + sdf3.format(x1));
		JOptionPane.showMessageDialog(null, "x2: " + sdf3.format(x2));
		JOptionPane.showMessageDialog(null, "x3: " + sdf3.format(x3));
		JOptionPane.showMessageDialog(null, "x4: " + sdf3.format(x4));
		
		JOptionPane.showMessageDialog(null, "y1: " + y1);
		JOptionPane.showMessageDialog(null, "y2: " + y2);
		JOptionPane.showMessageDialog(null, "y3: " + y3);
		JOptionPane.showMessageDialog(null, "x1: " + x1);
		JOptionPane.showMessageDialog(null, "x2: " + x2);
		JOptionPane.showMessageDialog(null, "x3: " + x3);
		JOptionPane.showMessageDialog(null, "x4: " + x4);
	}

}
