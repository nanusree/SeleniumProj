package classwork;

import java.util.*;

public class FindNegativeorPositive {

	public static void main(String[] args) {
	
		int a;
		
		Scanner in = new Scanner(System.in);

	    System.out.println("Enter a number");
	    a = in.nextInt();

	    in.close();
	    
	    if (a > 0) {
			
			System.out.println("Number is Positive");
		} else if (a == 0)  {
			
			System.out.println("Number is zero");
			
		} else 
				System.out.println("Number is Negative");
				
		
	}

}
