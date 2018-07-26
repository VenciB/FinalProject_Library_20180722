package by.htp.library.collection.controler;

import by.htp.library.collection.entity.ReadersList;

public class CreateAndLoadReaders {
	
	protected ReadersList createAndLoadReaders( ) {
		
		// get Singleton readers list:
		ReadersList newReadersList = createReadersList( );

		// load the readers list with readers:
		LoadReaders readersLoader = new LoadReaders();
		readersLoader.loadReaders( newReadersList );

		// return populated readers list:
		return newReadersList;
	}

	/**
	 * create and return a Singleton object
	 */
	private ReadersList createReadersList() {
		return ReadersList.getInstance();
	}
}
