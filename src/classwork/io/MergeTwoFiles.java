package classwork.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

	

public class MergeTwoFiles {

	public static void main(String[] args) throws Exception {
		createfile();
		mergeFile();
		
	}	
	
	

	public static void createfile() throws Exception {
		
		FileWriter out = new FileWriter("MyCharFile1.txt");
		
		try {
			String s1 = "This is my First Line \n";
			String s2= "This is my Second Line \n";
			String s3 =" My Last Line";
			
			out.write(s1);
			out.write(s2);
			out.write(s3);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			out.close();
			
		}
		FileWriter out1 = new FileWriter("MyCharFile2.txt");
	
		try {
		String st1 = "This is my First Line in second file \n";
		String st2= "This is my Second Line  in second file \n";
		String st3 =" My Last Line in second file";
		
		out1.write(st1);
		out1.write(st2);
		out1.write(st3);
	}catch(Exception e) {
		e.printStackTrace();
	} finally {
		out1.close();
		
	}
		System.out.println("File Created");
	}
	
public static void mergeFile() throws Exception {
	
	FileReader inputfile1 = null;
	FileReader inputfile2 = null;
	FileWriter outputStream = null;
	
	try {
		inputfile1 = new FileReader("MyCharFile1.txt");
		inputfile2 = new FileReader("MyCharFile2.txt");
		
		outputStream = new FileWriter("FileMerge.txt");
		
		int c = inputfile1.read();
		while (c!=1) {
			outputStream.write(c);
			c= inputfile1.read();
		}
		outputStream.write("\n");
		c= inputfile2.read();
		while (c!=1) {
			outputStream.write(c);
			c= inputfile2.read();
		}
	} finally {
		if(inputfile1 != null) {
			inputfile1.close();
		}
		if(inputfile2 != null) {
			inputfile2.close();
		}
		if (outputStream != null) {
			outputStream.close();
		}
	}
	System.out.println("File Merged");
}
			
}
