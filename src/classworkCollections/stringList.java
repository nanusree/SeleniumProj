package classworkCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class stringList {

	public static void main(String[] args) {
		
		slist();
		

	}

	public static void slist() {
		
		ArrayList<String> sl = new ArrayList<String>();
		
		sl.add("Selenium");
		sl.add("automates");
		sl.add("browsers");
		sl.add("What");
		sl.add("you");
		sl.add("do");
		sl.add("with");
		sl.add("that");
		sl.add("power");
		sl.add("is");
		sl.add("entirely");
		sl.add("up");
		sl.add("to");
		sl.add("you");
		
		System.out.println("--------Printing using Iterator------");
		
		Iterator<String> it = sl.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		
		System.out.println();
		
		Collections.sort(sl);
		System.out.println("After Sorting" + sl);
		
		Collections.shuffle(sl);
		System.out.println("After Shuffling" + sl);
		
		System.out.println("Min: " + Collections.min(sl));
		System.out.println("Max: " + Collections.max(sl));
		
		Collections.reverse(sl);
		System.out.println("After reverse" + sl);
		
		System.out.println("size of ArrayList :" + sl.size());
		
		sl.remove(4);
		System.out.println("After remove" + sl);
		
		//System.out.println("Index of 7 :" + sl.indexOf(7));
		
	
		
		
		
		
		
	}
}
