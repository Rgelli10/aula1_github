package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enuns.Color;

public class Program {

	public static void main(String[] args) {

		List<Shape> list = new ArrayList<>();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of shapes: "));
		
		for(int i=1; i<=n; i++) {
			
		JOptionPane.showMessageDialog(null, "Shape #" + i + " data.");
		
		String ch = JOptionPane.showInputDialog("Rectangle or Circle (r/c)");
		Color color = Color.valueOf((JOptionPane.showInputDialog("Color (Black/Blue/Red)")));
			if(ch.equalsIgnoreCase("r")) {
				double width = Integer.parseInt(JOptionPane.showInputDialog("Width: "));
				double height = Integer.parseInt(JOptionPane.showInputDialog("Height: "));
				list.add(new Rectangle(color, width, height));
			}else if(ch.equalsIgnoreCase("c")){
				double radius = Integer.parseInt(JOptionPane.showInputDialog("Radius: "));
				list.add(new Circle(color, radius));
			}
		}
		
		for(Shape shape: list) {
			JOptionPane.showMessageDialog(null, "SHAPE AREAS: \n\n\n" + String.format("%.2f", shape.area()));
		}
	}

}
