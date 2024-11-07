/**
 * @author Jeff Chernenko
 * A00745858
 */

public class AudioFile extends DigitalMedia {

	private String fileName;
	private int fileResolution;

	/**
	 * Empty AudioFile Constructor
	 */
	public AudioFile() {
		super();
	}
	
	/**
	 * AudioFile Constructor
	 * @param sku
	 * @param title
	 * @param artist
	 * @param year
	 * @param fileName
	 */
	public AudioFile(String sku, String title, String artist, int year, String fileName) {
		super(sku, title, artist, year);

		validateString(fileName);
		this.fileName = fileName;
	}

	/**
	 * AudioFile Constructor
	 * @param sku
	 * @param title
	 * @param artist
	 * @param year
	 * @param fileName
	 * @param fileResolution
	 */
	public AudioFile(String sku, String title, String artist, int year, String fileName, int fileResolution) {
		super(sku, title, artist, year);

		validateString(fileName);
		validateInt(fileResolution);
		
		this.fileName = fileName;
		this.fileResolution = fileResolution;
	}
	
	/**
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the file name to set
	 */
	public void setFileName(String fileName) {
		validateString(fileName);
		this.fileName = fileName;
	}

	/**
	 * @return the file resolution
	 */
	public int getFileResolution() {
		return fileResolution;
	}

	/**
	 * @param fileResolution the file resolution to set
	 */
	public void setFileResolution(int fileResolution) {
		validateInt(fileResolution);
		this.fileResolution = fileResolution;
	}

	@Override
	public void play() {
		System.out.println("Playing an audio file");
	}

	@Override
	public String toString() {
		return "AudioFile [fileName=" + fileName + ", fileResolution=" + fileResolution + ", toString()=" + super.toString() + "]";
	}
}
