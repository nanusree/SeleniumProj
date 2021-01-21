package classwork;

public class PrintVowelConsonent {

	public static void main(String[] args) {
	
		
		String vowel = " ";
		String consonent = " ";
		
		for (char i = 'a' ; i <= 'z' ; i++) {
			
			switch (i) {
			
			case 'a':
			case 'e':
			case 'i': 
			case 'o':
			case 'u':
				vowel = vowel + i + " ";
				
				break;
			default:
				consonent = consonent + i + " ";
			}
			
		}
		System.out.println("Vowels are: " + vowel);
		System.out.println("Consonents are: " +consonent);
	}
}

