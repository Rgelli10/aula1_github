package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	
	public void deposit (double amount) {
		balance+=amount;
	}
	
	public void withdraw (double amount) {
		balance-=amount + 5.0;
		
	}

	
	public String toString () {
		return  " Account: " 
				+ number + "\n"
				+" Holder: "
				+ holder + "\n"
				+ "balance: $ "
				+ String.format("%.2f", balance);
	}
	



	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolding(String holding) {
		this.holder = holding;
	}

	public double getBalance() {
		return balance;
	}
	
	
}
