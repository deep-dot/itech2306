package lab7;

public class TestProduct {

	public static void main(String[] args) {

		Product item1 = new Clothing();

		item1.display();

		Product item2 = new Product("food type");

		item2.display();

		Clothing myShirt1 = new Clothing();
		System.out.println("shirt weight is: " + myShirt1.getWeight());
		
		Product myShirt2 = new Clothing();
		System.out.println(myShirt2.getWeight());
		
		
		  // --- Testing BankAccount ---
        BankAccount acc1 = new BankAccount(500.0, "Alice");
        BankAccount acc2 = new BankAccount(300.0, "Bob");

        System.out.println("Initial Balance of acc1 (Alice): $" + acc1.getBalance());
        System.out.println("Initial Balance of acc2 (Bob): $" + acc2.getBalance());

        acc1.deposit(200);
        System.out.println("After depositing $200 to acc1: $" + acc1.getBalance());

        acc1.withdraw(100);
        System.out.println("After withdrawing $100 from acc1: $" + acc1.getBalance());

        acc2.transfer(acc1, 150);
        System.out.println("After transferring $150 from acc1 to acc2:");
        System.out.println("acc1 balance: $" + acc1.getBalance());
        System.out.println("acc2 balance: $" + acc2.getBalance());

        // --- Testing SavingsAccount ---
        SavingsAccount sAcc = new SavingsAccount(1000.0, "Charlie", 5.0, 0.05); // 5% annual interest

        System.out.println("\nInitial Savings Balance (Charlie): $" + sAcc.getBalance());

        sAcc.withdraw(100);  // This will also charge a $5 withdrawal fee
        System.out.println("After withdrawing $100 + $5 fee: $" + sAcc.getBalance());

        double interest = sAcc.applyInterest();
        System.out.println("Interest added for one day: $" + interest);
        System.out.println("Balance after interest: $" + sAcc.getBalance());

	}

}
