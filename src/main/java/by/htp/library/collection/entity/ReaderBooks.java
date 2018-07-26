package by.htp.library.collection.entity;

import java.time.LocalDate;

public class ReaderBooks {
	
	private int bookId;
	private LocalDate dateBookRented;
	
	public ReaderBooks() {
		super();
	}

	public ReaderBooks(int bookId) {
		this.bookId = bookId;
		this.dateBookRented = LocalDate.now();
	}

	public ReaderBooks(int bookId, LocalDate dateBookRented) {
		this.bookId = bookId;
		this.dateBookRented = dateBookRented;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public LocalDate getDateBookRented() {
		return dateBookRented;
	}

	public void setDateBookRented(LocalDate dateBookRented) {
		this.dateBookRented = dateBookRented;
	}

}