package classwork;

public class PrintCharArray {

	public static void main(String[] args) {
	
		 //Print character array for Alphabets A to Z 
		
		 
		 char [] myArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();


		 for (char tempChar : myArray) {
		 System.out.print(tempChar + " , ");
		
		 }

		 System.out.println();
		 System.out.println("Length : " +myArray.length);
	}
}
	
	


