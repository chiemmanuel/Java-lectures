package practice;

/*import java.io.FileWriter;*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class FileExercises {

	/*public static void main(String[] args) throws IOException {
		try {
			System.out.println("Enter the file content:");
			Scanner sc = new Scanner(System.in);
			String data = sc.nextLine();

			FileWriter dynamicFileWriter = new FileWriter("C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\file exercise\\NewFile1.txt");
			dynamicFileWriter.write(data);
			dynamicFileWriter.close();
			sc.close();
			System.out.println("File created");

			Scanner fileScanner = new Scanner(new File("C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\file exercise\\NewFile1.txt"));
			while (fileScanner.hasNextLine()) {
				System.out.println("file content" + fileScanner.nextLine());
			}
			fileScanner.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}*/
	public static void main(String[] args) throws IOException{
        String file = "C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\file exercise\\NewFile1.txt";
		File f = new File(file);
		if (f.canRead()){
			System.out.println("File can be read");
		}
        BufferedReader br = new BufferedReader(new FileReader(f));
		StringBuilder result = new StringBuilder();
		long skip = 35;
		int value;
		br.skip(skip);
		while ((value = br.read()) != -1) {
			result.append((char) value);
		}
		br.close();
		System.out.println(result.toString());
    }

}

