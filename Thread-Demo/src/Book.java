import java.io.IOException;

enum STATUS{
	NEW, DAMAGED, RETURN
}

public class Book {
	
	private String title;
	private float price;
	private STATUS status;

	public Book() {
		this.status = STATUS.NEW;
	}
	
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) throws InvalidPriceException {
		if(price<=0)
		{
			throw new InvalidPriceException("Price > 0");
		}
		
		
		this.price = price;
	}
	
	
}
