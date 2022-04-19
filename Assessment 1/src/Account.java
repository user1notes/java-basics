enum TYPE {
	SAVINGS, DEMAT, CURRENT
}

enum STATUS {
	ACTIVE, INACTIVE, CLOSED
}

public class Account {

	private String owner;
	private Address address;
	private int balance;
	private String date;
	private TYPE type;
	private STATUS status;
	private int number;

	static int counter = 100;

	private void generateNumber() {
		this.number = counter;
		counter++;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber() {
		this.generateNumber();
	}

	public Account() {

	}

	public Account(String owner, Address address, int balance, String date, TYPE type) {
		this.owner = owner;
		this.address = address;
		this.balance = balance;
		this.date = date;
		this.type = type;
		this.status = STATUS.ACTIVE;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public int deposit(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Negative values are not allowed");
		}
		this.balance += amount;
		return this.balance;
	}

	public int withdraw(int amount) throws IllegalArgumentException {
		if (amount > this.balance) {
			throw new IllegalArgumentException("You cannot withdraw amount greater than your balance");
		}
		this.balance -= amount;
		return balance;
	}

	public void display() {
		System.out.println("\nAccount Number: " + number + "\nOwner Name :" + owner + "\nAddress :" + this.address
				+ "\nAccount Type :" + type + "\nAccount Creation Date :" + date + "\nAccount Balance :" + balance
				+ "\nStatus : " + status);
	}

}
