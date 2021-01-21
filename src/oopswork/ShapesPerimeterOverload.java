package oopswork;

public class ShapesPerimeterOverload {

	float radius = 5.5f;
	
	
	public void perimeter(int side) {
		
		int p = 4 * side;
		System.out.println("Perimeter of Square :" + p);
	}
	
	public void perimeter(int length, int width) {
		
		int p1 =  2* (length + width);
		System.out.println("Perimeter of Rectangle :" + p1);
	}
	
	
	public int perimeter(int s1, int s2, int s3) {
	 int p2 = s1 + s2 +s3;
	 return p2;
		
	}
	
	public void perimeter() {
		double p = 2* Math.PI * radius;
		System.out.println("Perimeter of Circle :" + p);
				
	}
	public static void main(String[] args) {
		
		ShapesPerimeterOverload obj = new ShapesPerimeterOverload();
		
		obj.perimeter();
		
		obj.perimeter(10);
		
	    obj.perimeter(12,20);
		
		int peri= obj.perimeter(10, 20, 12);
		System.out.println("Perimeter of Triangle :" + peri);
		
	
	}

}
