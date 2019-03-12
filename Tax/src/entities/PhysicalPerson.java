package entities;

public abstract class PhysicalPerson {
	
	private String name;
	protected Double annualIncome;	
	
	public PhysicalPerson () {
		
	}

	public PhysicalPerson(String name, Double annualIncome) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract Double tax ();
	
	public String toString () {
		return "Name: " + getName() + "\n" +  String.format("%.2f", tax()); 
	}
	
	

}
