package util;

public class CurrencyConverter {

	public static final double IOF = 6.0;
	public static final double DollarPrice = 3.10;

	public static double dollar;

	public static double finalValue(double v) {
		return v = (IOF / 100 * DollarPrice * dollar) + DollarPrice * dollar;

	}

}
