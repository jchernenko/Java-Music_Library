/**
 * @author Jeff Chernenko
 * A00745858
 */

public class VinylRecord extends PhysicalMedia {

	private int numberOfTracks;
	private int weight;
	private int sizeInInches;

	private final int SINGLE_SIZE;
	private final int EP_SIZE;
	private final int LP_SIZE;

	private final int SINGLE_WEIGHT;
	private final int EP_WEIGHT;
	private final int LP_WEIGHT;
	
	private static final int DEFAULT_SIZE = 7;
	private static final int DEFAULT_WEIGHT = 40;
	private static final int DEFAULT_TRACK_NUMBER = 2;

	{
		SINGLE_SIZE = DEFAULT_SIZE;
		EP_SIZE = 10;
		LP_SIZE = 12;

		SINGLE_WEIGHT = DEFAULT_WEIGHT;
		EP_WEIGHT = 100;
		LP_WEIGHT = 180;
	}

	/**
	 * Empty VinylRecord constructor
	 */
	public VinylRecord() {
		super();
	}
	
	/**
	 * VinylRecord Constructor
	 * @param sku
	 * @param title
	 * @param artist
	 * @param year
	 */
	public VinylRecord(String sku, String title, String artist, int year) {
		this(sku, title, artist, year, DEFAULT_TRACK_NUMBER, DEFAULT_SIZE, DEFAULT_WEIGHT);
	}
	
	/**
	 * VinylRecord Constructor
	 * @param sku
	 * @param title
	 * @param artist
	 * @param year
	 * @param numberOfTracks
	 */
	public VinylRecord(String sku, String title, String artist, int year, int numberOfTracks) {
		super(sku, title, artist, year);
		
		validateInt(numberOfTracks);
		this.numberOfTracks = numberOfTracks;
	}

	/**
	 * VinylRecord Constructor
	 * @param sku
	 * @param title
	 * @param artist
	 * @param year
	 * @param numberOfTracks
	 * @param weight
	 * @param sizeInInches
	 */
	public VinylRecord(String sku, String title, String artist, int year, int numberOfTracks, int weight, int sizeInInches) {
		super(sku, title, artist, year);
		
		validateInt(numberOfTracks);
		this.numberOfTracks = numberOfTracks;
		
		setSizeInInches(sizeInInches);
		setWeight(weight);
	}

	/**
	 * @return the number of tracks
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * @param numberOfTracks the number of tracks to set
	 */
	public void setNumberOfTracks(int numberOfTracks) {
		validateInt(numberOfTracks);
		this.numberOfTracks = numberOfTracks;
	}

	/**
	 * @return the size in inches
	 */
	public int getSizeInInches() {
		return sizeInInches;
	}

	/**
	 * @param sizeInInches the size in inches to set
	 * @throws IllegalArgumentException if record size is invalid
	 */
	public void setSizeInInches(int sizeInInches) {
		
		if (sizeInInches == SINGLE_SIZE || sizeInInches == EP_SIZE || sizeInInches == LP_SIZE) {
			this.sizeInInches = sizeInInches;
		} else {
			throw new IllegalArgumentException("Record size is invalid");
		}
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 * @throws IllegalArgumentException if record weight in invalid
	 */
	public void setWeight(int weight) {

		if (sizeInInches == SINGLE_SIZE && weight == SINGLE_WEIGHT) {
			this.weight = weight;
		} else if (sizeInInches == EP_SIZE && weight == EP_WEIGHT) {
			this.weight = weight;
		} else if (sizeInInches == LP_SIZE && weight == LP_WEIGHT) {
			this.weight = weight;
		} else {
			throw new IllegalArgumentException("Record weight is invalid");
		}
	}

	@Override
	public String toString() {
		return "VinylRecord [numberOfTracks=" + numberOfTracks + ", sizeInInches=" + sizeInInches + ", weight=" + weight
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void play() {
		System.out.println("Playing a vinyl record");
	}
}
