package oopsInheritance;

import java.util.Scanner;

public class ShapeSquarechild extends AbstractShapesPerimeter {

	@Override
	public void perimeter() {
		int side = 6;
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter Side");
		 side = in.nextInt();
		 in.close();  
		    
		int p = 4 * side ;
		System.out.println("Perimeter of Square:" + p);
		
	}

public static void main(String[] args) {
		
	ShapeSquarechild obj = new ShapeSquarechild();
	obj.perimeter();

	}
}
