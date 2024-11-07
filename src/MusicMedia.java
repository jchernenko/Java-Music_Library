/**
 * @author Jeff Chernenko
 * A00745858
 */

public abstract class MusicMedia {

	private String sku;
	private String title;
	private String artist;
	private int year;
	public static final int CURRENT_YEAR = 2022;
	public static final int FIRST_YEAR = 1860;

	/**
	 * Empty MusicMedia constructor
	 */
	public MusicMedia() {
		super();
	}

	/**
	 * MusicMedia Constructor
	 * @param sku
	 * @param title  to set the title field
	 * @param artist
	 */
	public MusicMedia(String sku, String title, String artist) {
		super();
		validateString(title);
		validateString(artist);
		
		this.setSku(sku);
		this.title = title;
		this.artist = artist;
	}
	
	/**
	 * MusicMedia Constructor
	 * @param sku
	 * @param title  to set the title field
	 * @param artist
	 * @param year
	 */
	public MusicMedia(String sku, String title, String artist, int year) {
		super();
		validateString(title);
		validateString(artist);
		validateYear(year);
		
		this.setSku(sku);
		this.title = title;
		this.artist = artist;
		this.setYear(year);
	}
	

	/**
	 * Abstract Method
	 */
	public abstract void play();

	/**
	 * Validates String Method
	 * @param value
	 * @throws IllegalArgumentException if value is blank or null
	 */
	protected void validateString(String value) {

		if (value == null || value.isBlank()) {

			throw new IllegalArgumentException("invalid String entered");
		}
	}
	
	/**
	 * Validates integer Method
	 * @param value
	 * @throws IllegalArgumentException if value is equal to or less than 0
	 */
	protected void validateInt(int value) {
		
		if(value <= 0) {
			
			throw new IllegalArgumentException("invalid integer entered");
		}
	}
	
	/**
	 * Validates Year Method
	 * @param value
	 * @throws IllegalArgumentException if value is not between 1860 and the current year
	 */
	protected void validateYear(int value) {
		
		if(value < FIRST_YEAR || value > CURRENT_YEAR) {
			
			throw new IllegalArgumentException("invalid year entered");
		}
	}

	/**
	 * @return the title
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public final void setTitle(String title) {

		validateString(title);
		this.title = title;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {

		validateString(artist);
		this.artist = artist;
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		
		validateYear(year);
		this.year = year;
	}

	@Override
	public String toString() {
		return "MusicMedia [sku=" + sku + ", title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}

}
