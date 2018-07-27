package by.htp.library.collection.controler;

import by.htp.library.collection.entity.BookLinkedList;
import by.htp.library.collection.entity.ReadersList;

/**
 * interface used for Factory pattern,
 * to return the class which will
 * create and/or load the data for library.
 * @author v.bujic
 *
 */
public interface LoadLibraryAndReaders {

	void loadLibraryAndReaders( BookLinkedList libraryLinkedList, ReadersList readersList );
}
