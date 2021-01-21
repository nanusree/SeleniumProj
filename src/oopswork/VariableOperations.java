package oopswork;

public class VariableOperations {
	
	int a = 5;
	int b = 8;
	
	public void add() {
		int sum = a + b;
		System.out.println("Sum of the variables :" + sum);
	}
	
	public int multiply ( ) {
		
		int product = a * b;
		return product;
	}
	
	public void division(float var1, float var2) {
		
		float div = var1/var2;
		System.out.println("Quotient :" + div);
	}
	
	public int remainder(int p, int q) {
		
		int rem = p%q;
		return rem;
	}

	public static void main(String[] args) {
		
		VariableOperations obj = new VariableOperations();
		
		obj.add();
		int prod = obj.multiply();
		System.out.println("Product of Variables :"+ prod);
		obj.division(150, 2);
		int r = obj.remainder(344,3);
		System.out.println("Remainder :" +r);
		
		System.out.println("------------------------------");
		
		obj.a = 120;
		obj.b = 32;
		obj.add();
	}

}
