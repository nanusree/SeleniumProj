package oopswork;

public class ShapesPConstructor {

	float radius;
	
	int side, side1, side2, side3;
	
	int length, width;
	
	
	ShapesPConstructor (int s) {
		side = s;
	}
	
	ShapesPConstructor (int l, int w) {
		length = l;
		width = w;
	}
	
	ShapesPConstructor (int s1, int s2, int s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	ShapesPConstructor (float r) {
		radius = r;
	}
	
	
	public void perimeterSquare() {
		
		int p = 4 * side;
		System.out.println("Perimeter of Square :" + p);
	}

	public void perimeterRectangle() {
		
		int p1 =  2* (length + width);
		System.out.println("Perimeter of Rectangle :" + p1);
	}
	
	
	public void perimeterTriangle() {
	 int p2 = side1 + side2 +side3;
	 System.out.println("Perimeter of Triangle :" + p2);
		
	}
	
	public void perimeterCircle() {
		double p = 2* Math.PI * radius;
		System.out.println("Perimeter of Circle :" + p);
				
	}



	public static void main(String[] args) {
		
		ShapesPConstructor obj1 = new ShapesPConstructor(6);
		obj1.perimeterSquare();
		ShapesPConstructor obj2 = new ShapesPConstructor(10,20);
		obj2.perimeterRectangle();
		ShapesPConstructor obj3 = new ShapesPConstructor(12,14,10);
		obj3.perimeterTriangle();
		ShapesPConstructor obj4 = new ShapesPConstructor(9.5f);
		obj4.perimeterCircle();
	}

}
