package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Bishwajit
 *
 */
public class ReadingAFile {
	private String file;

	private ReadingAFile() {
		super();
		this.file = "C:\\newCoLogs\\development.log";
	}

	public static void main(String[] args) {
		ReadingAFile readingAFile = new ReadingAFile();
//        usingFileReader(readingAFile.getFile());
//		  usingBufferedReader(readingAFile.getFile());
		usingScanner(readingAFile.getFile());
	}

	/**
	 * Reading a File using FileReader.
	 * 
	 * @param fileName String.
	 */
	private static void usingFileReader(String fileName) {
		FileReader reader = null;
		int i;
		try {
			reader = new FileReader(fileName);
			while ((i = reader.read()) != -1) {
				if (i == 10) {
					System.out.print("yes");
				}
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("Reading Problem");
		}
	}

	/**
	 * Reading a File using BufferedReader.
	 * 
	 * @param fileName String.
	 */
	private static void usingBufferedReader(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String read;
			try {
				while ((read = br.readLine()) != null) {
					System.out.println(read);
				}
			} catch (IOException e) {
				System.err.print("IOException Found");
			}
		} catch (FileNotFoundException e) {
//			System.err.println("File Not Found");
			e.printStackTrace();
		}
	}

	/**
	 * Reading a File using Scanner.
	 * 
	 * @param fileName String.
	 */
	private static void usingScanner(String fileName) {
		File file = new File(fileName);
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.err.println("File Not Found");
		}
	}

	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}

}
