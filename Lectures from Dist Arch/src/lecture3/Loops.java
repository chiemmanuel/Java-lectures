package lecture3;

import java.util.Scanner;

public class Loops {
	
	public void ReverseFor() {
	
	String text;
	String output = "";
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter your string");
	text = scanner.nextLine();
	int length = text.length();

	for (int i = length - 1; i >= 0; i--) {
	    char character = text.charAt(i);
	    output += character;
	}
	System.out.print("The reverse is :" + output);
	scanner.close();
	}
	

}
