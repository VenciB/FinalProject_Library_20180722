package by.htp.library.collection.controler;

import by.htp.library.collection.entity.ReadersList;

public class CreateAndLoadReaders {
	
	protected ReadersList createAndLoadReaders( ReadersList readersList ) {
		
		// load the readers list with readers:
		LoadReaders readersLoader = new LoadReaders();
		readersLoader.loadReaders( readersList );

		// return populated readers list:
		return readersList;
	}
	
}
