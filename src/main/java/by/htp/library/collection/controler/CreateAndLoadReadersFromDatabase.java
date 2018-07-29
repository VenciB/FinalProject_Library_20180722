package by.htp.library.collection.controler;

import by.htp.library.collection.entity.ReadersList;

public class CreateAndLoadReadersFromDatabase {
	
	protected ReadersList createAndLoadReadersFromDatabase( ReadersList readersList ) {
		
		// load the readers list with readers:
		LoadReadersFromDatabase readersLoader = new LoadReadersFromDatabase();
		readersLoader.loadReaders( readersList );

		// return populated readers list:
		return readersList;
	}

}
