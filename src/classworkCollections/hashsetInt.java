package classworkCollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashsetInt {

	public static void main(String[] args) {
	
		hashSet();
		
		

	}
	
	public static void hashSet() {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(45);
		hs.add(36);
		hs.add(12);
		hs.add(78);
		hs.add(1);
		hs.add(233);
		hs.add(34);
		hs.add(5);
		hs.add(89);
	    hs.add(100);
	    
	    System.out.println("Min: " + Collections.min(hs));
		System.out.println("Max: " + Collections.max(hs));
		
		
		System.out.println("--------Printing using Iterator------");
		
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		
		System.out.println();
		
		System.out.println("Contains: " +hs.contains(5));
		
		hs.remove(233);
		System.out.println("After removing 233 : " + hs );
		
	}

}
