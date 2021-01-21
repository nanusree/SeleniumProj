package oopsInheritance;
import java.util.Scanner;

public class ShapeRectanglePrism implements InterfaceShape {

	@Override
	public void volume() {
		int l =0, w=0, h= 0;
		

		Scanner in = new Scanner(System.in);
		 System.out.println("Enter Length");
		    l = in.nextInt();
		 System.out.println("Enter Width");
		    w = in.nextInt();
		 System.out.println("Enter Height");
		    h = in.nextInt();
		 in.close();
		 
		System.out.println("Volume of Rectangular Prism :" +(l*w*h));
	}
	public static void main(String[] args) {
	
		ShapeRectanglePrism obj = new ShapeRectanglePrism();
		obj.volume();
		
	
	}
}
