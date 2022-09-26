import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
	
	
	
	public void createFile(String fileName) {
		
		try {
			File file = new File(fileName+".txt");
			if (file.createNewFile()) {
				System.out.println("File created: "
								+ file.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch (IOException e) {
			System.out.println("Error : Can't create file");
			e.printStackTrace();
		}
	}

	public void writeFile(String fileName) {

		System.out.println("In file write something\n");
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();

		try {
	         FileWriter writer = new FileWriter(fileName+".txt");
	         writer.write(data);
	         writer.close();
	         System.out.println("Successfully wrote to the file.");
	     }
	     catch (IOException e) {
	         System.out.println("Error : Can't write in file.");
	         e.printStackTrace();
	     }
		 scan.close();
	}
	
	public void readFile(String fileName) {
		System.out.println("In reader");
		try {
			File file = new File(fileName+".txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
//		         String data = Reader.nextLine();
				System.out.println(reader.nextLine());
			}
			reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Error : Can't read file.");
			e.printStackTrace();
		}
	}

}
