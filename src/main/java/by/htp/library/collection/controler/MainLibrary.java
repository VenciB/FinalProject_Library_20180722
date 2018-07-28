package by.htp.library.collection.controler;

import by.htp.library.collection.entity.BookLinkedList;
import by.htp.library.collection.entity.ReadersList;

public class MainLibrary {

	static GetAnswer ga = new GetAnswer();
	static String answerLoad = null;
	static LoaderFactory lf = new LoaderFactory();
	static LoadLibraryAndReaders llar;
	// create Singleton library object:
	static BookLinkedList libraryLinkedList = BookLinkedList.getInstance();
	// create Singleton readers list:
	static ReadersList readersList = ReadersList.getInstance();

	public static void main(String[] args) {

		answerLoad = ga.getString("In which mode to continue?\n" + "1) COLLECTION\n" + "2) DATABASE");
		llar = lf.loadLibraryAndReaders( answerLoad ); 
		llar.loadLibraryAndReaders(libraryLinkedList, readersList);
		
		// just testing:
		libraryLinkedList.showAllBooksForward();
		libraryLinkedList.showAllBooksBackword();

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