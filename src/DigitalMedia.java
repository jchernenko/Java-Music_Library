/**
 * @author Jeff Chernenko
 * A00745858
 */

public abstract class DigitalMedia extends MusicMedia implements FileProcessor {
	
	private String filePath;
	
	/**
	 *Empty DigitalMedia Constructor
	 */
	public DigitalMedia() {}
	
	/**
	 * DigitalMedia Constructor
	 * @param sku
	 * @param title
	 * @param artist
	 * @param year
	 */
	public DigitalMedia(String sku, String title, String artist, int year) {
		super(sku, title, artist, year);
	}
	
	/**
	 * Save DigitalMedia using file path
	 * @param filePath
	 */
	@Override
	public void save(String filePath) {
		
		validateString(filePath);
		this.filePath = filePath;
		
		System.out.println("Saving the audio file");
	}

	/**
	 * Delete DigitalMedia using file path
	 * @param filePath
	 */
	@Override
	public void delete(String filePath) {
		
		validateString(filePath);
		this.filePath = filePath;
		
		System.out.println("Deleting the audio file");
	}

	@Override
	public String toString() {
		return "DigitalMedia [filePath=" + filePath + ", toString()=" + super.toString() + "]";
	}
}
