package entities;

public class LegalPerson extends PhysicalPerson {
	
	private Integer employeeNumber;
	
	public LegalPerson () {
		
	}
	

	public LegalPerson(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}
	

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	@Override
	public Double tax () {
		if(employeeNumber > 10) 
			return getAnnualIncome() * 0.14;
		else 
			return getAnnualIncome() * 0.16;
	}
	
	public String toString () {
		return "Name: " + getName() + "\n" +  String.format("%.2f", tax()); 
	}
}
