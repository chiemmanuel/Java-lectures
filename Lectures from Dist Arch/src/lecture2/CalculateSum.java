

package lecture2;
import java.util.Scanner;

public class CalculateSum {
	
	int  value1;
	int value2;
	String name; 
	
	public void Calculate() {
	Scanner scanner = new Scanner(System.in);
	//name = scanner.nextLine();
	System.out.println("enter the input");
	value1 = scanner.nextInt();
	value2 = scanner.nextInt();
	
	System.out.printf("sum:%d " , (value1 + value2));
	scanner.close();
	}

}
