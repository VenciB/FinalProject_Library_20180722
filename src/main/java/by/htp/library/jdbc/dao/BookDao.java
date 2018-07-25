package by.htp.library.jdbc.dao;

import java.util.List;

import by.htp.library.jdbc.entity.Book;

public interface BookDao {
	
	Book read( int id );
	
	List<Book> listOfAllBooks();
	
	void create( Book book );
	

}
