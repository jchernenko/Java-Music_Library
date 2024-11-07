/**
 * @author Jeff Chernenko
 * A00745858
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MusicLibrary {
	
	private HashMap<String, MusicMedia> library;
	
	/**
	 * Empty MusicMedia constructor
	 */
	public MusicLibrary() {
		library = new HashMap<String, MusicMedia>();
	}
	
	/**
	 * Adds MusicMedia to HashMap
	 * @param key
	 * @param media
	 * @throws IllegalArguemntException if key or media are null
	 */
	public void addMusic(String key, MusicMedia media) {
		
		if(key == null) {
			throw new IllegalArgumentException("invalid key.");
		}
		else if(media == null) {
			throw new IllegalArgumentException("invalid media.");
		}
		
		library.put(key, media);
	}
	
	/**
	 * Displays HashMap
	 */
	public void displayLibrary() {
		Iterator itr = library.entrySet().iterator();
	       while (itr.hasNext()) {
	           System.out.println(itr.next());
	       }
	}
	
	/**
	 * Displays Hashmap objects using prefix as filter
	 * @param prefix
	 */
	public void displayChoice(String prefix) {
		for (Entry<String, MusicMedia> entry : library.entrySet()) {
		    String key = entry.getKey();
		    MusicMedia value = entry.getValue();
		    if(key.substring(0,2).equals(prefix)) {
		    	System.out.println(value);
		    }
		}
	}
}
