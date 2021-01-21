package classwork;

import java.util.Scanner;

//import java.util.*;

public class FahrenheitToCelsius {


	public static void main(String[] args) {
		
		float tempf = 0.0f;
		float tempc = 0.0f;
		
		Scanner in = new Scanner(System.in);

	    System.out.println("Enter temperature in F");
	    tempf = in.nextFloat();

		
		tempc = ((tempf-32) * 5)/9 ;
		
		System.out.println("Temp in Celcius :" + tempc);
		
	}

}
