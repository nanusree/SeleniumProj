package oopsInheritance;

public class MyShapeBaseclass {

		
	protected void perimeterSquare(int side) {
		int ps= 4 * side;
		System.out.println("Perimeter of Square :" + ps);
	}
	protected void perimeterRectangle(int length, int width) {
			int pr= 2 * (length+width);
			System.out.println("Perimeter of Rectangle :" + pr);
			
	}
}
