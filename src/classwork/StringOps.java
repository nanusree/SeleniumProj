package classwork;

public class StringOps {
	
	
	public static void stringsOps() {
		
		String str1 = "Selenium automates browsers. That's it!";
		
		System.out.println("Length of string str1:" + str1.length());
		
		System.out.println("Replace Selenium with Webdriver:" + str1.replaceAll("Selenium", "Webdriver"));
		
		System.out.println("Character at index 12 of str1:" + str1.charAt(12));
		
		System.out.println("Replace ! with ? :" + str1.replaceAll("!", "?"));
		
		System.out.println();
		
		String[] subarr = str1.split("'");
		for (String element : subarr ) {
 			System.out.print(element + "\t");
		}
		
		System.out.println();
		
		String[] subarr1 = str1.split("e");
		for (String element : subarr1 ) {
 			System.out.print(element + "\t");
		}
	}

	public static void main(String[] args) {
		
		stringsOps();
		

	}

}
