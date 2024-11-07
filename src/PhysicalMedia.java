/**
 * @author Jeff Chernenko
 * A00745858
 */

public abstract class PhysicalMedia extends MusicMedia {
	
	/**
	 * Empty PhysicalMedia constructor
	 */
	public PhysicalMedia() {
		
	}
	
	/**
	 * PhysicalMedia Constructor
	 * @param sku
	 * @param title
	 * @param artist
	 * @param year
	 */
	public PhysicalMedia(String sku, String title, String artist, int year) {
		super(sku, title, artist, year);
	}
}
