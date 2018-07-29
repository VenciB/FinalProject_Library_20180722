package by.htp.library.collection.controler;

public class LoaderFactory {
	
	public LoadLibraryAndReaders loadLibraryAndReaders( String loadType ) {
		
		if( loadType == null ) {
			return null;
		}
		
		if( loadType.equalsIgnoreCase( "COLLECTION" ) ) {
			System.out.println("here cl");
			return new CollectionLoader();
		} else if( loadType.equalsIgnoreCase( "DATABASE" ) ) {
			// return new DatabaseLoader();
		}
		
		return null;
		
	} // end method loadLibraryAndReaders

}
