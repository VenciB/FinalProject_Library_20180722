package by.htp.library.collection.controler;

import by.htp.library.collection.entity.BookLinkedList;

public class CreateAndLoadLibrary {

	protected BookLinkedList createAndLoadLibrary( BookLinkedList libraryLinkedList ) {
		
		// load the library with the books:
		LoadLibrary libraryLoader = new LoadLibrary();
		libraryLoader.loadLibrary( libraryLinkedList );
		
		// return ready library:
		return libraryLinkedList;
	}
	
}
