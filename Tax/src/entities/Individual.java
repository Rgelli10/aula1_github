package entities;

public class Individual extends PhysicalPerson {
	
	private Double healthExpenses;
	
	public Individual () {
		
	}
	
	public Individual(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public  Double tax () {
		if(getAnnualIncome()<20000.0) 
			return getAnnualIncome() * 0.15 - healthExpenses * 0.5;
		else
			return getAnnualIncome() * 0.25 - healthExpenses * 0.5;
	}
	
	public String toString () {
		return "Name: " + getName() + "\n" +  String.format("%.2f", tax()); 
	}
	

}
