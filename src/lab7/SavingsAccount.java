package lab7;

public class SavingsAccount extends BankAccount {
	
	private double withdrawlFee;
	private double percentageInterest;
	private double intrestPerDay;

	public SavingsAccount(double balance, String accOwner, double withdrawlFee, double percentageInterest) {
		super(balance, accOwner);
		this.withdrawlFee = withdrawlFee;
		this.percentageInterest = percentageInterest;
	}
	
	@Override
	public boolean withdraw(double moneyOut) {
		
		double total = moneyOut + getWithdrawlFee();
		 if(total <= super.getBalance()){
			 super.withdraw(total);
			 return true;
		 }
		 return false;
	}
	
	public double applyInterest() {
		intrestPerDay = (super.getBalance() * percentageInterest) / 365;
		super.deposit(intrestPerDay);
		return intrestPerDay;
	}
	
	public double getWithdrawlFee() {
	    return withdrawlFee;
	}

	public double getPercentageInterest() {
	    return percentageInterest;
	}

	
}
