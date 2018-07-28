package by.htp.library.jdbc.dao;

import java.util.List;

import by.htp.library.collection.entity.Book;

public interface BookDao {
	
	Book read( int id );
	
	List<Book> listBooks();
	
	void create( Book book );
	

}
