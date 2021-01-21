package oopsInheritance;
import java.util.Scanner;

public class ShapeCube implements InterfaceShape {

	@Override
	public void volume() {
		double a = 0.0F;
		 Scanner in = new Scanner(System.in);  ///instead of this use constructor and pass values while creating object
		 System.out.println("Enter length of edge");
		 a = in.nextFloat();
		 in.close();
		    
		double vol = Math.pow(a, 3);
		System.out.println("Volume of cube :" + vol);
	}
	
	public static void main(String[] args) {
		ShapeCube obj = new ShapeCube();
		obj.volume();

	}

}
