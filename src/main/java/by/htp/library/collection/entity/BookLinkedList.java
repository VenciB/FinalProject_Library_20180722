package by.htp.library.collection.entity;

public class BookLinkedList {
	
	/**
	 * creating a Singleton class:
	 */
	private static BookLinkedList instance = new BookLinkedList();
	
	/**
	 * declaring nodes:
	 */
	private Node first;
	private Node last;
	private int numOfBooks;
	
	/**
	 * private constructor so that class can not be instantiated:
	 */
	private BookLinkedList( ) {
		first = null;
		last = null;
		numOfBooks = 0;
	}
	
	public static BookLinkedList getInstance() {
		return instance;
	}
	
	/**
	 * add new book in list:
	 * @param book
	 */
	public void addBook( Book book ) {
		
		Node newNode = new Node( last, book, null );
		
		if( first == null ) {
			first = newNode;
		} else {
			last.next = newNode;
		}
		last = newNode;
		numOfBooks++;
		
	} // end addBook
	
	/**
	 * print forward all the books in list information:
	 */
	public void showAllBooksForward( ) {
		
		Node current = first;
		
		while( current != null ) {
			current.printNodeBook();
			current = current.next;
		}
	}
	
	/**
	 * print backward all the books in list information:
	 */
	public void showAllBooksBackword( ) {
		Node current = last;
		
		while( current != null ) {
			current.printNodeBook();
			current = current.previous;
		}
	}
	
	/**
	 * delete one book from the list 
	 * with the book_id
	 * @param bookId
	 */
	public void deleteBook( int bookId ) {
		Node current = first;
		
		while( current.nodeBook.getBookId() != bookId ) {
			current = current.next;
			if( current == null ) {
				System.out.println("No book with id " + bookId + " found.");
				return;
			}
		} // end while 
		
		if( current == first ) {
			first = current.next;
			current.next.previous = null;
		} else if( current == last ) {
			last = current.previous;
			current.previous.next = null;
		} else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		numOfBooks--;
		System.out.println("Book with id " + bookId + " was removed.");
	} // end deleteBook

	
	public Node getFirst() {
		return first;
	}

	
	public Node getLast() {
		return last;
	}

	
	public int getNumOfBooks() {
		return numOfBooks;
	}

}