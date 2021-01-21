package oopswork;

public class FindArea {
	
	float radius = 5.5f;
	int side = 10;
	
	int lenght = 9;
	int width = 6;
	
	public void areaofCircle() { //Method without return value
		double a = Math.PI * radius * radius;
		System.out.println("Area of Circle: " + a);
	}

	public int areaofSquare() { //Method with return type
		int area = side * side;
		return area;
	}
	
	public void areaofRectangle (int l,int w) { //Method without return value but with parameters
		int area = l * w;
		System.out.println("Area of rectangle: " + area);
	}
	
	public double perimeterCircle(float r) {   //Method wth return value and parameters
		double p = 2 * Math.PI * r;
		return p;
	}
	
	
	public static void main(String[] args) {
		
		FindArea obj = new FindArea();
		System.out.println("radius :" + obj.radius);
		
		obj.areaofCircle();
		obj.areaofRectangle(3, 4);
		int sqarea = obj.areaofSquare();
		System.out.println("Area of square :" + sqarea);
		
		double peri =obj.perimeterCircle(8.5f);
		System.out.println("Perimeter of Circle :" + peri);

	}

}
