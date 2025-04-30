package lab7Tests;

import lab7.BankAccount;
import lab7.SavingsAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTransferTest {

    @Test
    public void testTransferBetweenTwoNormalAccounts() {
        BankAccount acc1 = new BankAccount(1000, "Alice");
        BankAccount acc2 = new BankAccount(500, "Bob");

        acc2.transfer(acc1, 300); // Transfer 300 from Alice to Bob

        assertEquals(700, acc1.getBalance(), 0.001); // Alice loses 300
        assertEquals(800, acc2.getBalance(), 0.001); // Bob gains 300
    }

    @Test
    public void testTransferFromSavingsToNormal_EnoughForFee() {
        SavingsAccount savings = new SavingsAccount(400.20, "Saver", 0.20, 0.05);
        BankAccount normal = new BankAccount(100, "Receiver");

        normal.transfer(savings, 400); // Try to transfer 400 from savings to normal

        assertEquals(0.0, savings.getBalance(), 0.001); // Savings now 0
        assertEquals(500, normal.getBalance(), 0.001); // Normal account gets 400
    }

    @Test
    public void testTransferFromSavingsToNormal_NotEnoughForFee() {
        SavingsAccount savings = new SavingsAccount(400.00, "Saver", 0.20, 0.05);
        BankAccount normal = new BankAccount(100, "Receiver");

        normal.transfer(savings, 400); // Should fail (fee makes total 400.20)

        assertEquals(400, savings.getBalance(), 0.001); // No change
        assertEquals(100, normal.getBalance(), 0.001); // No change
    }

    @Test
    public void testTransferFromNormalToSavings() {
        BankAccount normal = new BankAccount(800, "Alice");
        SavingsAccount savings = new SavingsAccount(200, "Bob", 0.20, 0.04);

        savings.transfer(normal, 300); // Transfer 300 from normal to savings

        assertEquals(500, normal.getBalance(), 0.001); // Normal loses 300
        assertEquals(500, savings.getBalance(), 0.001); // Savings gets 300
    }

    @Test
    public void testTransferBetweenTwoSavingsAccounts() {
        SavingsAccount saver1 = new SavingsAccount(1000, "S1", 0.50, 0.03);
        SavingsAccount saver2 = new SavingsAccount(200, "S2", 0.20, 0.05);

        saver2.transfer(saver1, 500); // Try to transfer 500 from S1 to S2 (S1 needs 500.50)

        assertEquals(499.50, saver1.getBalance(), 0.001); // 1000 - (500 + 0.50)
        assertEquals(700, saver2.getBalance(), 0.001);    // 200 + 500
    }

    @Test
    public void testTransferToSameAccountFails() {
        BankAccount acc = new BankAccount(1000, "Self");

        acc.transfer(acc, 200); // Should be ignored

        assertEquals(1000, acc.getBalance(), 0.001); // No change
    }
}
