package practice;

public class ErrorHandling {

	public static void main(String args[]) throws ArithmeticException{
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("Result: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide a number by 0");
		}
	}

}
