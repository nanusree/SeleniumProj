package oopswork;

public class Dog {
	
	int legs = 4;
	int tail = 1;
	
	String color ="White";
	
	public void bark() {
		System.out.println("bow ...bow....bow...");
	}
	
	public void sleep() {
		
		System.out.println("zzz...zzz....zzzz");
	}
	
	

	public static void main(String[] args) {
		
		Dog jimmy = new Dog();
				
		jimmy.bark();
		jimmy.sleep();
		
		System.out.println("---------------------");
		
		Dog rummy = new Dog();
		rummy.color = "black";
		System.out.println("rummy color :" + rummy.color);
		rummy.legs = 4;
		rummy.bark();
		rummy.sleep();
	}

}
