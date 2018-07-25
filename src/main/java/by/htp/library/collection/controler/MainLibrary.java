package by.htp.library.collection.controler;

import by.htp.library.collection.entity.BookLinkedList;

public class MainLibrary {

	public static void main(String[] args) {
		
		// create and load a library with Collection, Singleton pattern:
		CreateAndLoadLibrary libraryCreator = new CreateAndLoadLibrary();
		BookLinkedList libraryLinkedList = libraryCreator.createAndLoadLibrary();
		
		// just testing:
		libraryLinkedList.showAllBooksForward();
		libraryLinkedList.showAllBooksBackword();

	}

}
