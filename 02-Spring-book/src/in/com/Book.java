package in.com;

public class Book {
	
	
	private String bookName;
	private int price;
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + "]";
	}
	
	
	

}
