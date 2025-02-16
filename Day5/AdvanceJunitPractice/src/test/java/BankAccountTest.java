import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testingbanking.BankAccount;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(100.0); // Initial balance of $100
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "Deposit should increase balance correctly");
    }

    @Test
    void testWithdrawSuccess() {
        assertTrue(account.withdraw(50.0), "Withdrawal should succeed with sufficient funds");
        assertEquals(50.0, account.getBalance(), "Balance should be updated after withdrawal");
    }

    @Test
    void testWithdrawFailure() {
        assertFalse(account.withdraw(200.0), "Withdrawal should fail with insufficient funds");
        assertEquals(100.0, account.getBalance(), "Balance should remain unchanged after failed withdrawal");
    }

    @Test
    void testWithdrawZeroAmount() {
        assertFalse(account.withdraw(0), "Withdrawal of zero should fail");
    }

    @Test
    void testDepositNegativeAmount() {
        account.deposit(-20.0);
        assertEquals(100.0, account.getBalance(), "Negative deposits should not change balance");
    }
}

