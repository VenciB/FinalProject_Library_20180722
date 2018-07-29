package by.htp.library.collection.controler;

import by.htp.library.collection.entity.BookLinkedList;
import by.htp.library.collection.entity.ReadersList;

public class DatabaseLoader implements LoadLibraryAndReaders {

	public void loadLibraryAndReaders( BookLinkedList libraryLinkedList, ReadersList readersList ) {
		
		// create and load a library from database with JDBC:
		CreateAndLoadLibraryFromDatabase libraryCreator = new CreateAndLoadLibraryFromDatabase();
		libraryLinkedList = libraryCreator.createAndLoadLibraryFromDatabase( libraryLinkedList );
		
		// create and load a list of readers from database with JDBC:
		CreateAndLoadReadersFromDatabase readersCreator = new CreateAndLoadReadersFromDatabase();
		readersList = readersCreator.createAndLoadReadersFromDatabase( readersList );
		
	}

}
