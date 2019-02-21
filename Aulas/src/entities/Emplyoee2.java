package entities;

public class Emplyoee2 {

	private String name;
	private Integer id;
	private Double salary;

	public Emplyoee2() {

	}

	public Emplyoee2(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}