package classwork;

public class PrintPrimenos {

	public static void main(String[] args) {
	
		//1, 3, 5, 7, 11, 13, 17, ....
		
		int n = 1;
		
		String Primenum = " ";
	
		
		for (int i=1 ; i <=1000 ; i++) {
			
			int counter=0;
			
			for (n=i; n>=1; n--) {
				
				if (i%n == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				Primenum = Primenum + i + " ";
				
			}
			
		}
		System.out.println(Primenum);
	
	}

}
