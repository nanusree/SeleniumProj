package classwork;

import java.util.*;

public class CalcIncomeTax {

	public static void main(String[] args) {
		
		float sal = 0.0F;
		float tax = 0.0F;
		float taxrate = 0.0F;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Income");
		sal = in.nextInt();
		
		in.close();
		
		if (sal < 25000) {
			System.out.println("Income Tax is zero");
		} else if (sal <= 50000) {
			
			taxrate = (float)0.10;
			tax = sal * taxrate;
			System.out.println("Income Tax is: " + tax);
			
		} else if (sal <=75000) {
			
			taxrate = (float)0.20;
			tax = sal * taxrate;
			System.out.println("Income Tax is: " + tax);
			
		} else {
			
			taxrate = (float)0.30;
		    tax = sal * taxrate;
		    System.out.println("Income Tax is: " + tax);
	} 
	}
		
	}



