package lab7;

public class BankAccount {

	private double balance;
	private String accOwner;
	
	public BankAccount(double balance, String accOwner) {
		this.balance = balance;
		this.accOwner = accOwner;
	}
	
	public void deposit(double moneyIn) {
		
		if(moneyIn < 0) {
			System.out.println("Deposit correct amount.");
			return;
		}
		
		balance += moneyIn;
		
	}
	
	public boolean withdraw(double moneyOut) {
		
		if(moneyOut > balance) {
			System.out.println("Sorry, not enough amount available.");
			return false;
		}
		
		balance -= moneyOut;
		return true;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccOwner() {
		return accOwner;
	}
}
