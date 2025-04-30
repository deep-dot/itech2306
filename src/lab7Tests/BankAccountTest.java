package lab7Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import lab7.BankAccount;

public class BankAccountTest {

    @Test
    public void testInitialBalance() {
        BankAccount acc1 = new BankAccount(1000000, "dee");
        assertEquals(1000000, acc1.getBalance(), 0.001);
    }

    @Test
    public void testGetAccOwner() {
        BankAccount acc = new BankAccount(500, "kuldeep");
        assertEquals("kuldeep", acc.getAccOwner());
    }

    @Test
    public void testDepositValidAmount() {
        BankAccount acc = new BankAccount(200, "test");
        acc.deposit(100);
        assertEquals(300, acc.getBalance(), 0.001);
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccount acc = new BankAccount(200, "test");
        acc.deposit(-50); // should be ignored
        assertEquals(200, acc.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawValidAmount() {
        BankAccount acc = new BankAccount(500, "test");
        boolean result = acc.withdraw(200);
        assertTrue(result);
        assertEquals(300, acc.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        BankAccount acc = new BankAccount(100, "test");
        boolean result = acc.withdraw(150); // too much
        assertFalse(result);
        assertEquals(100, acc.getBalance(), 0.001);
    }
}
