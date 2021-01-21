package classworkCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MyHashMap {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Map<String,String> hm = new HashMap<String,String>();
		
	
		hm.put("Login_id", "Admin");
		hm.put("Login_pwd", "testpassword");
		hm.put("Search_type", "hotel");
		hm.put("Destination", "Las Vegas");
		hm.put("Cust_name", "h2kInfosys");
		hm.put("Cust_phone", "123 456 3456");
	
		System.out.println("Size : " + hm.size());
		System.out.println("Is empty : " + hm.isEmpty());
		System.out.println(hm);
		
		System.out.println();
		
		Set<String> keys = hm.keySet();
		System.out.println("Keys set : " + keys);
		
		System.out.println();
		
		
		Collection<String> vals = hm.values();
		System.out.println("Values : " + vals);
		
		System.out.println();
	
		hm.replace("Cust_name","h2kInfosys", "Steve");
		
		System.out.println("after replace Cust_name : " + hm);
		
		System.out.println();
		
		
		hm.remove("Cust_phone", "123 456 3456");
		  
		System.out.println("after remove Cust_Phone : " + hm);
		 
		
	
	}

}
