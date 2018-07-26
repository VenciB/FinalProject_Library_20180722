package by.htp.library.collection.controler;

import by.htp.library.collection.entity.BookLinkedList;
import by.htp.library.collection.entity.ReadersList;

public class MainLibrary {

	public static void main(String[] args) {
		
		// create and load a library with Collection, Singleton pattern:
		CreateAndLoadLibrary libraryCreator = new CreateAndLoadLibrary();
		BookLinkedList libraryLinkedList = libraryCreator.createAndLoadLibrary();
		
		// just testing:
		libraryLinkedList.showAllBooksForward();
		libraryLinkedList.showAllBooksBackword();
		
		// create and load a list of readers:
		CreateAndLoadReaders readersCreator = new CreateAndLoadReaders();
		ReadersList readersList = readersCreator.createAndLoadReaders();
		
		//  just testing:
		for( int i = 0; i < readersList.getReadersListSize(); i++ ) {
			System.out.println(
					"ID: " + readersList.getReaderAtIndex(i).getReaderId()
					+ "; Name: " + readersList.getReaderAtIndex(i).getName()
					+ "; Surname: " + readersList.getReaderAtIndex(i).getName()
					);
		}

	}

}
