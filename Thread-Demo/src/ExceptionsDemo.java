import java.io.IOException;

public class ExceptionsDemo {
	
	public static void main(String[] args) {
		Book book = new Book();
		
		try {
			book.setPrice(-1000);
		}
		catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}

	}

}
