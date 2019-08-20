/**
 * 
 */
package fileHandling;

import java.io.File;

/**
 * @author Bishwajit
 *
 */
public class FilePermission {

	private String file;

	private FilePermission() {
		super();
		this.file = "C:\\newCoLogs\\server.log";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FilePermission filePermission = new FilePermission();
		// TODO Auto-generated method stub

		File fileReader = new File(filePermission.getFile());
		boolean isExist = fileReader.exists();
		System.out.println(isExist);
		if (isExist) {
			checkingThePermission(fileReader);

			// changing the permission
			changingThePermission(fileReader);

			// checking the permission
			checkingThePermission(fileReader);

		} else {
			System.out.println("File not available");
		}
	}

	private static void changingThePermission(File fileReader) {
		fileReader.setExecutable(true);
		fileReader.setReadable(true);
		fileReader.setWritable(true);
	}

	private static void checkingThePermission(File fileReader) {
		System.out.println("Executable: " + fileReader.canExecute());
		System.out.println("Readable: " + fileReader.canRead());
		System.out.println("Writable: " + fileReader.canWrite());
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
