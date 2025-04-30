package lab7Tests;

import lab7.SavingsAccount;
import lab7.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {

    @Test
    public void testWithdrawWithSufficientBalance() {
        BankAccount acc = new SavingsAccount(4000.0, "Dee", 0.20, 0.05);
        boolean result = acc.withdraw(500.0);
        assertTrue(result);
        assertEquals(3499.80, acc.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawFailsWhenBalanceTooLow() {
        SavingsAccount acc = new SavingsAccount(3000.0, "Dee", 0.20, 0.05);
        boolean result = acc.withdraw(3000.0);
        assertFalse(result);
        assertEquals(3000.0, acc.getBalance(), 0.001);
    }

    @Test
    public void testApplyInterestIncreasesBalance() {
        SavingsAccount acc = new SavingsAccount(3650.0, "Dee", 0.20, 0.05); // 5% yearly
        double interest = acc.applyInterest();
        assertEquals((3650.0 * 0.05) / 365, interest, 0.0001);
        assertEquals(3650.0 + interest, acc.getBalance(), 0.0001);
    }

    @Test
    public void testGetters() {
        SavingsAccount acc = new SavingsAccount(1000.0, "Dee", 0.30, 0.04);
        assertEquals(0.30, acc.getWithdrawlFee(), 0.0001);
        assertEquals(0.04, acc.getPercentageInterest(), 0.0001);
    }
}
