/**
 * @author Jeff Chernenko
 * A00745858
 */

public class CompactDisc extends PhysicalMedia {

	private int numberOfTracks;

	/**
	 * Empty CompactDisc Constructor
	 */
	public CompactDisc() {
		super();
	}

	/**
	 * CompactDisc Constructor
	 * @param sku
	 * @param title
	 * @param artist
	 * @param year
	 * @param numberOfTracks
	 */
	public CompactDisc(String sku, String title, String artist, int year, int numberOfTracks) {
		super(sku, title, artist, year);

		validateInt(numberOfTracks);
		this.numberOfTracks = numberOfTracks;
	}

	/**
	 * @return the numberOfTracks
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * @param numberOfTracks the numberOfTracks to set
	 */
	public void setNumberOfTracks(int numberOfTracks) {
		validateInt(numberOfTracks);
		this.numberOfTracks = numberOfTracks;
	}

	@Override
	public void play() {
		System.out.println("Playing the " + getTitle() + " compact disc");
	}

	@Override
	public String toString() {
		return "CompactDisc [numberOfTracks=" + numberOfTracks + ", toString()=" + super.toString() + "]";
	}
}
