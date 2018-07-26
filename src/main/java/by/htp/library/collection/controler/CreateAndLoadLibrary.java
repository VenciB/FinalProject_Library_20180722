package by.htp.library.collection.controler;

import by.htp.library.collection.entity.BookLinkedList;

public class CreateAndLoadLibrary {

	protected BookLinkedList createAndLoadLibrary() {
		
		// get Singleton library object:
		BookLinkedList newLibrary = createLibrary();
		
		// load the library with the books:
		LoadLibrary libraryLoader = new LoadLibrary();
		libraryLoader.loadLibrary(newLibrary);
		
		// return ready library:
		return newLibrary;
	}
	
	/**
	 * create and return a Singleton object
	 */
	private BookLinkedList createLibrary() {
		return BookLinkedList.getInstance();
	}
}
