package application;

import javax.swing.JOptionPane;

import util.CurrencyConverter;

public class Program7 {

	public static void main(String[] args) {

		CurrencyConverter.dollar = Integer.parseInt(JOptionPane.showInputDialog("How many dollars will be bought? "));

		double v = 0;

		CurrencyConverter.finalValue(v);

		JOptionPane.showMessageDialog(null, "Amount to be paid in reais = " + CurrencyConverter.finalValue(v));

	}

}
