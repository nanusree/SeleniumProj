package oopsInheritance;

public class MyShapeChildclass extends MyShapeBaseclass {

	
	
	public void perimeterTriangle(int side1, int side2, int side3) {
		System.out.println("Perimeter of Triangle :" + (side1+side2+side3));
	}
	
	public void perimeterCircle(double r) {
		System.out.println("Perimeter of Circle :" + (2* Math.PI * r));
	}
	
	
	public static void main(String[] args) {
		
		MyShapeChildclass obj = new MyShapeChildclass();
		obj.perimeterSquare(12);
		obj.perimeterRectangle(10,14);
		obj.perimeterTriangle(30, 23, 34);
		obj.perimeterCircle(9.5f);
		
	}

}
