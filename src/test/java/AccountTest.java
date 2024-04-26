import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import temp0.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(10000);
    }

    @Test
    void createAccount() {
        assertNotNull(account);
    }

    @Test
    void createAccountInit10000won() {
        assertEquals(10000, account.getBalance());
    }

    @Test
    void depositAndConfirmation() {
        account.deposit(400);
        assertEquals(10400, account.getBalance());
    }

    @Test
    void withdrawAndConfirmation() {
        account.withdraw(600);
        assertEquals(9400, account.getBalance());
    }

    @Test
    void 은행이자가5퍼센트올라간다() {
        account.welfare();
        assertEquals(10500, account.getBalance());
    }

    @Test
    void 이자률조정() {
        account.setWelfareRate(1.08);
        assertEquals(1.08, account.getWelfareRate());
    }

    @Test
    void 변경된이자률적용() {
        account.setWelfareRate(1.08);
        account.welfare();
        assertEquals(10800, account.getBalance());
    }

    @Test
    void n년후의예상금액을알려줌() {
        int result = account.expectBalance(3);
        assertEquals(11576, result);
    }
}