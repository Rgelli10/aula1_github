package entities;

public class SavingsAccountPlus extends SavingsAccount {

	@Override
	public void whitDraw (double amount) {
		balance -= amount + 2.0;
	}
	
}
