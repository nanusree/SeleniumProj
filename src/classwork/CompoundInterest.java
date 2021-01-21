package classwork;

//import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		int p = 20000;
		int t = 5;
		float r =9.5f;
		
		double amount = 0.0f;
		
		float rate = 1 + (r/100);
		
		//Calculate interest A = P ( 1+r ) ^ t
		
		amount = p * Math.pow(rate , t);
		
		System.out.println("Interest Amount : " + amount);
		
	}

}


//Scanner in = new Scanner(System.in);

		//System.out.println("Enter Principal Amount");
		//p = in.nextInt();
		
		
		//System.out.println("Enter interest");
		//r = in.nextInt();

		//System.out.println("Enter years");
		//t = in.nextInt();