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
	
	public void transfer(BankAccount fromAccount, double amount) {
	    // Check: source and destination must not be the same
	    if (fromAccount == this) {
	        System.out.println("Cannot transfer to the same account.");
	        return;
	    }

	    // Try to withdraw from the source account
	    boolean success = fromAccount.withdraw(amount);

	    if (success) {
	        // Deposit into this account
	        this.deposit(amount);
	        System.out.println("Transfer successful.");
	    } else {
	        System.out.println("Transfer failed: insufficient funds.");
	    }
	}

	public double getBalance() {
		return balance;
	}
	
	public String getAccOwner() {
		return accOwner;
	}
}
