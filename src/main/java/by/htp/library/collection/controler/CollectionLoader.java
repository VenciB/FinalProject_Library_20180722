package by.htp.library.collection.controler;

import by.htp.library.collection.entity.BookLinkedList;
import by.htp.library.collection.entity.ReadersList;

public class CollectionLoader implements LoadLibraryAndReaders {

	public void loadLibraryAndReaders( BookLinkedList libraryLinkedList, ReadersList readersList ) {
		
		// create and load a library with Collection, Singleton pattern:
		CreateAndLoadLibrary libraryCreator = new CreateAndLoadLibrary();
		libraryLinkedList = libraryCreator.createAndLoadLibrary( libraryLinkedList );
		
		// create and load a list of readers:
		CreateAndLoadReaders readersCreator = new CreateAndLoadReaders();
		readersList = readersCreator.createAndLoadReaders( readersList );
		
	}

}
