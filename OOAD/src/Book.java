enum STATUS{
	NEW, DAMAGED, RETURN
}

public class Book {
	
	public String title;
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
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override 
	public String toString() {
		System.out.println("11");
		return "[Title" + title + "]";
		//return "[Title " + title + ",Price " + price + "]";
	}
	
}
