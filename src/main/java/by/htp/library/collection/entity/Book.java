package by.htp.library.collection.entity;

public class Book {

	private int bookId;
	private String title;
	private String author;
	private int yearOfPublishing;
	private int quantity;
	private int booksRentedOut;
	
	/**
	 * CONSTRUCTOR
	 * @param bookId
	 * @param title
	 * @param author
	 * @param yearOfPublishing
	 */
	public Book( int bookId, String title, String author, int yearOfPublishing, int quantity ) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.yearOfPublishing = yearOfPublishing;
		this.quantity = quantity;
		this.booksRentedOut = 0;
	} // end constructor

	public int getBookId() {
		return bookId;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
	
	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getBooksRentedOut() {
		return booksRentedOut;
	}

	public void setBooksRentedOut(int booksRentedOut) {
		this.booksRentedOut = booksRentedOut;
	}
	
}