package by.htp.library.jdbc.entity;

import java.util.Arrays;

public class Book {

	private int yearOfPublishing;
	private String title;
	private String publisher;
	private int book_id;
	private int quantity;
	private int booksRentedOut;
	private Author[] authors;

	/**
	 * Constructor
	 * @param yearOfPublishing
	 * @param title
	 * @param publisher
	 * @param book_id
	 * @param quantity
	 * @param listofauthors
	 */
	public Book(int yearOfPublishing, String title, String publisher, int book_id, int quantity, Author... listofauthors) {
		this.yearOfPublishing = yearOfPublishing;
		this.title = title;
		this.publisher = publisher;
		this.book_id = book_id;
		this.quantity = quantity;
		this.booksRentedOut = 0;
		this.authors = createAuthorsArray(listofauthors);
	}

	/**
	 * Create a list of authors method.
	 * @param listofauthors
	 * @return
	 */
	private Author[] createAuthorsArray(Author... listofauthors) {
		if (listofauthors.length == 0) {
			authors = new Author[1];
			authors[0] = new Author();
		} else {
			authors = new Author[listofauthors.length];
			for (int i = 0; i < listofauthors.length; i++) {
				authors[i] = listofauthors[i];
			} // end for loop
		} // end if - else
		return authors;
	}
	
	
	/**
	 * Add quantity of available books:
	 * @param addQuantity
	 */
	public void addQuantity( int addQuantity ) {
		this.quantity += addQuantity;
	}

	/**
	 * Substract quantity of available books:
	 * @param substractQuantity
	 */
	public void substractQuantity( int substractQuantity ) {
		this.quantity -= substractQuantity;
	}
	
	
	/** 
	 * getters and setters:
	 */
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
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
	
	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	/** 
	 * end getters and setters.
	 */
	
	
	/**
	 * to String method
	 */
	@Override
	public String toString() {
		return "Book [yearOfPublishing=" + yearOfPublishing + ", title=" + title + ", publisher=" + publisher
				+ ", book_id=" + book_id + ", quantity=" + quantity + ", booksRentedOut=" + booksRentedOut
				+ ", authors=" + Arrays.toString(authors) + "]";
	}
	

} // end class