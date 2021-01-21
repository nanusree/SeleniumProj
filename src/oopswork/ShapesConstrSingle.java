package oopswork;

public class ShapesConstrSingle {
	
float radius;
	
	int side, side1, side2, side3;
	
	int length, width;
	
	
	ShapesConstrSingle (int s,int l, int w,int s1, int s2, int s3,float r) {
		side = s;
		length = l;
		width = w;
		side1 = s1;
		side2 = s2;
		side3 = s3;
		radius=r;
		
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
		
		System.out.println("***********************1st set of values*******************************");
	
		ShapesConstrSingle obj1 = new ShapesConstrSingle(6,10,20,12,14,10,9.5f);
		obj1.perimeterSquare();
		obj1.perimeterRectangle();
		obj1.perimeterTriangle();
		obj1.perimeterCircle();
		
		System.out.println("**************************2nd set of values****************************");
		ShapesConstrSingle obj2 = new ShapesConstrSingle(8,11,10,12,12,11,10.5f);
		obj2.perimeterSquare();
		obj2.perimeterRectangle();
		obj2.perimeterTriangle();
		obj2.perimeterCircle();
		
		System.out.println("**************************3rd set of values****************************");
		ShapesConstrSingle obj3 = new ShapesConstrSingle(15,21,12,32,22,15,10.5f);
		obj3.perimeterSquare();
		obj3.perimeterRectangle();
		obj3.perimeterTriangle();
		obj3.perimeterCircle();
	}

}
