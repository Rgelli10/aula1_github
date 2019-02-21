package entities;

public class Triangule {
	
	public double width;
	public double height;
	
	
	public double area () {
		double a = (width + height)/2.0;
		return Math.sqrt(a * (a - width) * (a - height));
	}
	
	public double perimeter() {
		return (diagonal()+area())*2;
		
	}
	
	public double diagonal() {
		double d = (width + height)*2;
		return Math.sqrt(d*(d + width)*(width + height));
	}

}
