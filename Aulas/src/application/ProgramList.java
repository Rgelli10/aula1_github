package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class ProgramList {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		JOptionPane.showMessageDialog(null, list.size());

		//list.remove(1);
		//list.removeIf(x -> x.charAt(0) == 'M');
		
		
		for (String x: list) {
			JOptionPane.showMessageDialog(null, x);
		}
		
		JOptionPane.showMessageDialog(null, "Index of Bob: " + list.indexOf("Bob"));
		
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x: result) {
			JOptionPane.showMessageDialog(null, x);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		JOptionPane.showMessageDialog(null, name);
	}

}
