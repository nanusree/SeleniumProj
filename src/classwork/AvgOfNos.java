package classwork;

public class AvgOfNos {
	
	//Print Avg of numbers from 1-50

	public static void main(String[] args) {
		
		
		int i = 1;
					
		int sum = 0;
		
		float avg = 0.0f;
		
		do {
			
			sum = sum + i;
			
			avg = sum/(float)i;
				
			i++;
			
		} while (i <= 50);
		
		System.out.println(i);  	
		System.out.println("Sum of 1 to 50 = " + sum);
		System.out.println("Avg of nos 1 to 50 = " + avg);


	}

}
