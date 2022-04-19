enum TYPE{
	SB,FD
}


public class Account {
	
	private int number;
	private String odate;
	private TYPE type;
	private double balance;
	private Customer customer;
	
	static int counter = 100000;
	
	private void generateAccNumber() {
		this.number = counter;
		counter++;
	}
	
	public Account(String odate, TYPE type, double balance, Customer customer) {
		this.odate = odate;
		this.type = type;
		this.balance = balance;
		this.customer = customer;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber() {
		this.generateAccNumber();
	}

	public String getOdate() {
		return odate;
	}

	public void setOdate(String odate) {
		this.odate = odate;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void display(){
		System.out.println("\nAccount Number: " + number + "\nCustomer ID :" + customer.getCustomerId() + "\nAccount Type :" + type +  "\nAccount Creation Date :" + odate + "\nAccount Balance :" + balance);
	}
	
	@Override
	public String toString() {
		return "\nAccount Number: " + number + "\nCustomer ID :" + customer.getCustomerId() + "\nAccount Type :" + type +  "\nAccount Creation Date :" + odate + "\nAccount Balance :" + balance ;
	}

	
	

}
