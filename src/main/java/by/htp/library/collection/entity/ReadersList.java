package by.htp.library.collection.entity;

import java.util.ArrayList;

public class ReadersList {

	/**
	 * creating a Singleton object
	 */
	private static ReadersList instance = new ReadersList();
	
	// readers list:
	private ArrayList<Reader> listOfLibraryReaders;

	/**
	 * private constructor so that class can not be instantiated:
	 */
	private ReadersList() {
		listOfLibraryReaders = new ArrayList<Reader>();
	}
	
	// get the only instance of ReadersList
	public static ReadersList getInstance( ) {
		return instance;
	}
	
	/**
	 * methods for listOfLibraryReaders
	 */
	public void addReader( Reader reader ) {
		listOfLibraryReaders.add( reader );
	}
	
	public void addReaderAtIndex( int readerIndex, Reader reader ) {
		listOfLibraryReaders.add( readerIndex, reader );
	}
	
	public void setReaderAtIndex( int readerIndex, Reader reader ) {
		listOfLibraryReaders.set( readerIndex, reader );
	}
	
	public void removeReaderAtIndex( int readerIndex ) {
		listOfLibraryReaders.remove( readerIndex );
	}
	
	public Reader getReaderAtIndex( int readerIndex ) {
		return listOfLibraryReaders.get( readerIndex );
	}
	
}
