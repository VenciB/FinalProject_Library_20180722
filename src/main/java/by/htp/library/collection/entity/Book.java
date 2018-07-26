package by.htp.library.collection.entity;

public class Book {

	private int book_id;
	private String title;
	private String author;
	private int yearOfPublishing;
	private int quantity;
	private int booksRentedOut;
	
	/**
	 * CONSTRUCTOR
	 * @param book_id
	 * @param title
	 * @param author
	 * @param yearOfPublishing
	 */
	public Book( int book_id, String title, String author, int yearOfPublishing, int quantity ) {
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.yearOfPublishing = yearOfPublishing;
		this.quantity = quantity;
		this.booksRentedOut = 0;
	} // end constructor

	public int getBook_id() {
		return book_id;
	}
	
	public void setBook_id(int book_id) {
		this.book_id = book_id;
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