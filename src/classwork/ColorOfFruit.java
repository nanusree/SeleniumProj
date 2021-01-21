package classwork;

import java.util.*;


public class ColorOfFruit {

	public static void main(String[] args) {
	
		String fruit = "fruit";
		
		Scanner in = new Scanner(System.in);

	   System.out.println("Enter the name of fruit");
	   fruit = in.next();
	    
		
		switch (fruit.toLowerCase()) {
			
			case "apple": 
			case "strawberry":
				System.out.println("Color of Fruit: Red");
				break;
			case "orange":
				System.out.println("Color of Fruit: Orange");
				break;
				
			case "banana":
			case "mango" :
				System.out.println("Color of Fruit: Yellow");
				break;
			case "grapes" :
				System.out.println("Color of Fruit: Purple");
				break;
			case "cherry" :
				System.out.println("Color of Fruit: Dark Red");
				break;
				default:
					System.out.println("Color of Fruit: Not a fruit");
		}
		
		
	    
	}

}
