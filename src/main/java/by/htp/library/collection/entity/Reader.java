package by.htp.library.collection.entity;

import java.time.LocalDate;
import java.util.ArrayList;

import by.htp.library.collection.ReaderBooks;

public class Reader {
	
	private String name;
	private String surname;
	private String patronymic;
	private String phoneNumber;
	private int readerId;
	private String password;
	private ArrayList<ReaderBooks> libraryCard;	
	
	/** Constructor 1
	 * @param name
	 * @param surname
	 * @param phoneNumber
	 * @param readerId
	 * @param password
	 */
	public Reader(String name, String surname, String phoneNumber, int readerId, String password) {
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.readerId = readerId;
		this.password = password;
		this.libraryCard = new ArrayList<ReaderBooks>();
	}

	/** Constructor 2
	 * @param name
	 * @param surname
	 * @param patronymic
	 * @param phoneNumber
	 * @param readerId
	 * @param password
	 */
	public Reader(String name, String surname, String patronymic, String phoneNumber, int readerId, String password) {
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.phoneNumber = phoneNumber;
		this.readerId = readerId;
		this.password = password;
		this.libraryCard = new ArrayList<ReaderBooks>();
	}

	/**********************************************
	 * start of methods to work with library card *
	 **********************************************/
	// update reader's library card with new book:
	public void addBookToLibraryCard( ReaderBooks readerBooksRecord ) {
		libraryCard.add( readerBooksRecord );		
	}
	
	// remove book from reader's library card:
	public void removeBookFromLibraryCard( int bookIndexInLibraryCard ) {
		libraryCard.remove( bookIndexInLibraryCard );		
	}
	
	// get book record from library card at index:
	public ReaderBooks getBookRecordAtIndex( int bookIndex ) {
		return libraryCard.get( bookIndex );
	}
	
	// set book record in library card at index:
	public void setBookRecordAtIndex( int bookIndex, ReaderBooks readerBook ) {
		libraryCard.set( bookIndex, readerBook );
	}
	
	// get date of book rental from library card at index:
	public LocalDate getLocalDateFromLibraryCardAtIndex( int bookIndex ) {
		return libraryCard.get(bookIndex).getDateBookRented();
	}
	
	// get the number of records in library card:
	public int getSizeOfLibraryCard( ) {
		return libraryCard.size();
	}
	/********************************************
	 * end of methods to work with library card *
	 ********************************************/

	
	/****************************************
	 * start of getters and setters section *
	 ****************************************/
	public ArrayList<ReaderBooks> getLibraryCard() {
		return libraryCard;
	}

	public void setLibraryCard(ArrayList<ReaderBooks> libraryCard) {
		this.libraryCard = libraryCard;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	/**************************************
	 * end of getters and setters section *
	 **************************************/

	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + readerId;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reader other = (Reader) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (readerId != other.readerId)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Reader [name=" + name + ", surname=" + surname + ", patronymic=" + patronymic + ", phoneNumber="
				+ phoneNumber + ", readerId=" + readerId + "]";
	}
	

} // end main
