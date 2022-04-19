
public class BankDemo {

	public static void main(String[] args) {

		Customer c1 = new Customer("name1","address1","Telephone1","Email1");
		c1.setCustomerId();
		c1.display();
		
		Customer c2 = new Customer("name2","address2","Telephone2","Email2");
		c2.setCustomerId();
		c2.display();

		Customer c3 = new Customer("name3","address3","Telephone3","Email3");
		c3.setCustomerId();
		c3.display();

		
		Account a1 = new Account("Date1",TYPE.FD,5000.0,c1);
		a1.setNumber();
		System.out.println(a1);

		Account a2 = new Account("Date2",TYPE.SB,500,c2);
		a2.setNumber();
		a2.display();

		Account a3 = new Account("Date3",TYPE.SB,500,c3);
		a3.setNumber();
		a3.display();
		
	}
	


}
