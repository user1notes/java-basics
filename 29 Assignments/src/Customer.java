
public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;
	private String customerTelephone;
	private String customerEmail;
	
	static int counter = 1000;
	private void generateId(){
		this.customerId = counter;
		counter++;
	}
	
	public Customer(String customerName, String customerAddress, String customerTelephone, String customerEmail) {
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.customerTelephone = customerTelephone;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId() {
		this.generateId();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerTelephone() {
		return customerTelephone;
	}

	public void setCustomerTelephone(String customerTelephone) {
		this.customerTelephone = customerTelephone;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	public void display(){
		System.out.println("\nCutomer ID: " + customerId + "\nCustomer Name :" + customerName + "\nCustomer Address :" + customerAddress +  "\nCustomer Email :" + customerEmail + "\nCustomer Phone :" + customerTelephone);
	}
	
	@Override
	public String toString() {
		return "\nCutomer ID: " + customerId + "\nCustomer Name :" + customerName + "\nCustomer Address :" + customerAddress +  "\nCustomer Email :" + customerEmail + "\nCustomer Phone :" + customerTelephone ;
	}

}
