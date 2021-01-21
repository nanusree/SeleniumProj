package classwork;

public class CalculateEMI {
	
	public static void main(String[] args) {
		
		int p = 100000;
		float r =9.75f;
		int n = 3;
		
		double amount = 0.0f;
		
		float rate = (r/12/100);
		
		double rp = Math.pow((1+rate), n*12);
		
		System.out.println("rate of interest : " + rate);
		
		amount = p * rate * rp / (rp-1);
	
		
		System.out.println("EMI Amount : " + amount);
		
	}

}
