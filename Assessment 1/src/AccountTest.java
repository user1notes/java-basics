import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Address address1;
	Account account;

	@Before
	public void init() {
		address1 = new Address("Mumbai", "Maharashtra", "454647", "1234567890", "230", "Main street");
		account = new Account("David", address1, 5000, "21-02-2022", TYPE.SAVINGS);
	}

	@Test
	public void testDeposit() {
		int balance = account.deposit(1000);
		assertEquals(6000, balance);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDepositNegative() throws IllegalArgumentException {
		int balance = account.deposit(-50);
	}

	@Test
	public void testWithdraw() throws IllegalArgumentException {
		int balance = account.withdraw(2000);
		assertEquals(3000, balance);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWithdrawInvalid() throws IllegalArgumentException {
		int balance = account.withdraw(7000);
	}

}
