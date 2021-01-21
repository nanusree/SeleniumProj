package classwork;

public class ArraySumOfRows {

	public static void main(String[] args) {
		
		
int [] [] my2Darray = new int [4][5];
		
		
		my2Darray [0][0]= 11;
		my2Darray [0][1]= 12;
		my2Darray [0][2]= 13;
		my2Darray [0][3]= 14;
		my2Darray [0][4]= 15;
		
		my2Darray [1][0]= 21;
		my2Darray [1][1]= 22;
		my2Darray [1][2]= 23;
		my2Darray [1][3]= 24;
		my2Darray [1][4]= 25;
		
		my2Darray [2][0]= 31;
		my2Darray [2][1]= 32;
		my2Darray [2][2]= 33;
		my2Darray [2][3]= 34;
		my2Darray [2][4]= 35;
		
		my2Darray [3][0]= 41;
		my2Darray [3][1]= 42;
		my2Darray [3][2]= 43;
		my2Darray [3][3]= 44;
		my2Darray [3][4]= 45;
		
	
		int sum = 0;	
		

		for(int row=0; row <4; row++) {
			sum = 0;
			for (int col=0; col < 5; col++) {
				
				sum = sum + my2Darray[row][col];
										
			}
			
			System.out.println("Sum of array elements in row : " + sum);
		
			
		}

	}

}
