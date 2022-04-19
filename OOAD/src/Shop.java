import java.util.Comparator;

public class Shop {
	
	public static void main(String args[])
	{
		Book b1 = new Book();
		System.out.println(b1.getPrice());
		
		createBooks();
	}

	private static void createBooks() {
		
		Book b[] = new Book[4];

		for(int i=0;i<4;i++) {
			Book xb = new Book();
			b[i] = xb;
		}
		
		b[0].setPrice(10);
		b[1].setPrice(5);
		b[2].setPrice(75);
		b[3].setPrice(35);
		
		//b.sort((b1,b2) -> (int) (b1.getPrice() - b2.getPrice()));
		
		
		b.sort(new Comparator<Integer>(){
			
			@Override
			public int compare(Book b1, Book b2) {
				return b1.getPrice() - b2.getPrice();
			}
	});

		
	}
}
