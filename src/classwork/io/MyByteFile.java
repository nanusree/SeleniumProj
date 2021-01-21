package classwork.io;

import java.io.FileOutputStream;
import java.util.Scanner;

public class MyByteFile {

	public static void main(String[] args) throws Exception {
		
		createFile();
		
		
	}
	
	
	public static void createFile() throws Exception {
		
		FileOutputStream out = new FileOutputStream("MyByteFile.txt");
		
		try {
			Scanner in = new Scanner(System.in);

		    System.out.println("Enter data to be entered in file, type END to finish");
		    
		    while(true) {
		    String str = in.nextLine();
		    
		    if(str.equals("END")) {
		    	break;
		    }
		    out.write(str.getBytes());
		    out.write("\n".getBytes());
		    }
			
			
			in.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
		out.close();
		}
		
		System.out.println("File Created");
	}

}
