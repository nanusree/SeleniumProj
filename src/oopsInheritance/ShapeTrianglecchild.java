package oopsInheritance;

import java.util.Scanner;

public class ShapeTrianglecchild extends AbstractShapesPerimeter {

	
	@Override
	public void perimeter() {
		int s1=0, s2=0, s3=0;
		
		Scanner in = new Scanner(System.in);
		 System.out.println("Enter Side 1");
		 s1 = in.nextInt();
		 System.out.println("Enter Side 2");
		 s2 = in.nextInt();
		 System.out.println("Enter Side 3");
		 s3 = in.nextInt();
		 in.close();   
		    
		System.out.println("Perimeter of Triangle:" + (s1+s2+s3) );
		
	}

	public static void main(String[] args) {
		
		ShapeTrianglecchild obj = new ShapeTrianglecchild();
		obj.perimeter();
		
	}
}
