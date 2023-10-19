package lecture3;

import java.util.Scanner;

public class Strings {
	public void UpperCase(){
	String text;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter your string");
	text = scanner.nextLine();
	System.out.println(text.toUpperCase());
	scanner.close();
	}
	public void LowerCase(){
		String text;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string");
		text = scanner.nextLine();
		System.out.println(text.toLowerCase());
	scanner.close();	
	}
}
