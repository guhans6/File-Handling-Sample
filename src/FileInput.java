public class FileInput {
	
	
	public static void main(String[] args) {
		
		//write to file
		FileHandler fh = new FileHandler();
		fh.createFile("test");
		fh.writeFile("test");
		
		//read from file
		fh.readFile("test");
	
	}	
}
