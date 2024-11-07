/**
 * @author Jeff Chernenko
 * A00745858
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment1 {
	
	private MusicLibrary library;
	
	public static void main(String[] args) {

		Assignment1 a1 = new Assignment1();
		
		try {
			a1.init();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		a1.displayMenu();
	}

	public void init() throws FileNotFoundException{
		
		Scanner scanner = null;
		MusicLibrary library = new MusicLibrary();
		this.library = library;
		
		try {
			
			File source = new File("music_data.txt");
			
			if(!source.exists()) {
				System.out.println("Source file is missing.");
				System.exit(-1);
			}
		
		scanner = new Scanner(source);
		
		int lineNumber = 1;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            lineNumber++;
            String[] matches = line.split("\\|");
            	
            for (int i=0; i<matches.length; i++) { 
            	if(matches[0].substring(0,2).equals("af")) {
            		DigitalMedia af = new AudioFile(matches[0], matches[1], matches[2], Integer.parseInt(matches[3]), matches[4], Integer.parseInt(matches[5]));
            		library.addMusic(matches[0], af);
            		}
            	else if(matches[0].substring(0,2).equals("cd")) {
            		PhysicalMedia cd = new CompactDisc(matches[0], matches[1], matches[2], Integer.parseInt(matches[3]), Integer.parseInt(matches[4]));
            		library.addMusic(matches[0], cd);
            		}
            	else if(matches[0].substring(0,2).equals("vr")) {
            		PhysicalMedia vr = new VinylRecord(matches[0], matches[1], matches[2], Integer.parseInt(matches[3]), Integer.parseInt(matches[4]), Integer.parseInt(matches[5]), Integer.parseInt(matches[6]));
            		library.addMusic(matches[0], vr);
            		}
            	}
        	}
		}
		
        finally {
        	scanner.close();
        }
	}
	
	public void displayMenu() {
		
		Scanner scanner = new Scanner(System.in);
		boolean mainLoop = true;
		int choice;
		while(true) {
		System.out.println("Choose one of the following options:");
		System.out.println(" 1. Display Audio Files");
		System.out.println(" 2. Display Compact Discs");
		System.out.println(" 3. Display Vinyl Records");
		System.out.println(" 4. Exit");
			
		choice = scanner.nextInt();
			
		if(choice == 1) {
			library.displayChoice("af");
			System.out.println(" ");
			new Assignment1();
			}
			
		else if(choice == 2) {
			library.displayChoice("cd");
			System.out.println(" ");
			new Assignment1();
			}
				
		else if(choice == 3) {
			library.displayChoice("vr");
			System.out.println(" ");
			new Assignment1();
			}
			
		else if(choice == 4) {
			System.out.println("Exit");
			System.exit(0);
			break;
		}
		else {
			System.out.println("Invalid Choice.");
			System.out.println(" ");
			}
		}
		scanner.close();
	}
}
