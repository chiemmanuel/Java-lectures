package lecture4;

import java.io.*;
import java.util.Scanner;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        /*File fileobj = new File("C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\file exercise\\NewFile.txt");

        try {
            if (fileobj.createNewFile()) {
                System.out.println("New file Created");
            } else {
                System.out.println("Already exists");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Method 1 writing into file
        try {
            FileWriter filewriter = new FileWriter("C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\file exercise\\NewFile.txt");
            filewriter.append("Life sucks");
            filewriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Method 2 writing into file Dynamically
        try {
            System.out.println("Enter the file content:");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();

            FileWriter dynamicFileWriter = new FileWriter("C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\file exercise\\NewFile.txt");
            dynamicFileWriter.write(data);
            dynamicFileWriter.close();
            sc.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        */
        
        // Method 3 Bufferedwriter using offset 
        Scanner sc1 = new Scanner(System.in);
        BufferedWriter bf1 = null;
        try {
            System.out.println("Enter the content (Enter '.' on a new line to exit):");
            FileWriter file1 = new FileWriter("C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\file exercise\\NewFile.txt");
            bf1 = new BufferedWriter(file1);

            String data1;
            while (!(data1 = sc1.nextLine()).equals(".")) {
                bf1.write(data1, 0, data1.length());
                bf1.newLine();
            }
        } catch (IOException e) {
        	e.printStackTrace();
        } finally {
            if (bf1 != null) {
                bf1.close();
            }
            sc1.close();
        
    }
        String filePath = "C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\file exercise\\NewFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
} }
