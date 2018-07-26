package by.htp.library.collection.controler;

import by.htp.library.collection.entity.Reader;
import by.htp.library.collection.entity.ReadersList;

public class LoadReaders {
	
	protected ReadersList loadReaders( ReadersList newReadersList ) {
		Reader reader1 = new Reader( "Andrew", "John", "44717", 1, "password1");
		Reader reader2 = new Reader( "Elena", "Vadimovna", "Olegov", "7654398", 2, "password2");
		Reader reader3 = new Reader( "Nikola", "Nike", "612432", 3, "password3");
		Reader reader4 = new Reader( "Oleg", "Olegovich", "Olegovski", "980154", 4, "password4");
		Reader reader5 = new Reader( "Brian", "Smith", "32176654", 5, "password5");
		
		newReadersList.addReader( reader1 );
		newReadersList.addReader( reader2 );
		newReadersList.addReader( reader3 );
		newReadersList.addReader( reader4 );
		newReadersList.addReader( reader5 );
		
		return newReadersList;
	}

}
