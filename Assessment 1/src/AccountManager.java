import java.util.Scanner;

public class AccountManager {

	public static int printChoices() {
		System.out.println("1.Deposit money");
		System.out.println("2.Withdraw money");
		System.out.println("3.Display Account details");
		System.out.println("4.Exit");
		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) throws IllegalArgumentException {

		Scanner sc = new Scanner(System.in);
		Address address1 = new Address("Mumbai", "Maharashtra", "454647", "1234567890", "230", "Main street");
		Address address2 = new Address("Pune", "Maharashtra", "454747", "0123456789", "580", "Evolve street");
		Address address3 = new Address("Nagpur", "Maharashtra", "464647", "7896543210", "630", "Baker street");

		Account accounts[] = new Account[3];

		Account account1 = new Account("David", address1, 5000, "21-02-2022", TYPE.SAVINGS);
		account1.setNumber();
		Account account2 = new Account("Bob", address2, 8000, "12-02-2022", TYPE.DEMAT);
		account2.setNumber();
		Account account3 = new Account("Alice", address3, 15000, "05-02-2021", TYPE.CURRENT);
		account3.setNumber();

		accounts[0] = account1;
		accounts[1] = account2;
		accounts[2] = account3;

		System.out.print("Enter your account number: ");
		int accountNumber = sc.nextInt();
		Account accountSelected = new Account();

		for (int i = 0; i < 3; i++) {
			if (accounts[i].getNumber() == accountNumber) {
				accountSelected = accounts[i];
			}
		}

		int choice = printChoices();
		while (choice != 4) {
			if (choice == 1) {
				System.out.println("Enter amount to deposit:");
				int amount = sc.nextInt();
				try {
					accountSelected.deposit(amount);
					System.out.println(
							"Amount deposited successfully \n Current balance: " + accountSelected.getBalance());
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}

			}
			if (choice == 2) {
				System.out.println("Enter amount to withdraw:");
				int amount = sc.nextInt();
				try {
					accountSelected.withdraw(amount);
					System.out.println(
							"Amount withdrawn successfully \n Current balance: " + accountSelected.getBalance());
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}

			}
			if (choice == 3) {
				accountSelected.display();
			}
			System.out.println();
			choice = printChoices();

		}
		System.out.println("Session is closed, Thank you!");

	}

}
