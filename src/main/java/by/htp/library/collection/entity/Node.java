package by.htp.library.collection.entity;

public class Node {
	
	public Book nodeBook;
	public Node next;
	public Node previous;
		
	/**
	 * CONSTRUCTOR
	 * @param previous
	 * @param book
	 * @param next
	 */
	public Node( Node previous, Book book, Node next ) {
		this.nodeBook = book;
		this.previous = previous;
		this.next = next;
	}
	
	/**
	 * print one book information
	 */
	public void printNodeBook( ) {
		System.out.println( "Book id: " + nodeBook.getBook_id() + " | " 
						+ "Title: " + nodeBook.getTitle() + " | " 
						+ "Author: " + nodeBook.getAuthor() + " | " 
						+ "Year: " + nodeBook.getYearOfPublishing() + " | " 
						+ "Quantity: " + nodeBook.getQuantity() + " | "
						+ "Available: " + ( nodeBook.getQuantity() - nodeBook.getBooksRentedOut() ) + "."
						);
	}
}