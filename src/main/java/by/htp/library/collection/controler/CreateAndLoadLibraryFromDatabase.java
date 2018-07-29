package by.htp.library.collection.controler;

import by.htp.library.collection.entity.BookLinkedList;

public class CreateAndLoadLibraryFromDatabase {
	
	protected BookLinkedList createAndLoadLibraryFromDatabase( BookLinkedList libraryLinkedList ) {
		
		// load the library with the books:
		LoadLibraryFromDatabase libraryLoader = new LoadLibraryFromDatabase();
		libraryLoader.loadLibrary( libraryLinkedList );
		
		// return ready library:
		return libraryLinkedList;
	}

}
