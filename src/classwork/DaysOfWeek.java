package classwork;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
	
		int a;
		
		Scanner in = new Scanner(System.in);

	    System.out.println("Enter a number");
	    a = in.nextInt();
	    
	    if (a == 1) {
	    	System.out.println("It is Sunday");
	    } else if (a == 2) {
	    	System.out.println("It is Monday");
	    } else if (a == 3) {
	    	System.out.println("It is Tuesday");
	    } else if (a == 4) {
	    	System.out.println("It is Wednesday");
	    } else if (a == 5) {
	    	System.out.println("It is Thursday");
	    } else if (a == 6) {
	    	System.out.println("It is Friday");
	    } else if (a == 7) {
	    	System.out.println("It is Saturday");
	    } else {
	    	System.out.println("Invalid");
	    }
	}

}
