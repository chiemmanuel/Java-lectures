package lecture3;

import java.util.Scanner;

public class ConditionalStatement {
	
	public void voteCheck() {
	int age;
	int voting_age = 18;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter your age");
	age = scanner.nextInt();
	if (age >= voting_age) {
	  System.out.println("you can vote");
	} else {
	System.out.println("you can not vote");
	}
	scanner.close();
}
	public void dayswitch() {
		
	int day;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the day number");
	day = scanner.nextInt();
	switch(day) {
	case 1:
		System.out.print("Monday");
	case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default: 
    	System.out.println("The number doesnt correspond to anyday, dont you know the number of days?");
	}
	scanner.close();
	}
	
}
