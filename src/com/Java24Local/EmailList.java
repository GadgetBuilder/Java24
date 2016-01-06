package com.Java24Local;

import java.awt.*;
import java.util.*;

public class EmailList {
	public static void main(String args[]) {
	HashMap<String, String> eMails = new HashMap<>();	
		eMails.put("Fred", "fred.jones@aol.com");
		eMails.put("Jack", "jack.jones@aol.com");
		eMails.put("Jill", "jill.jones@aol.com");
		
		String emailKey = eMails.get("Jack");
		System.out.println("Key at 1 is " + emailKey);
		
		Set set = eMails.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("Key is: " + mentry.getKey() + " Value is: ");
			System.out.println(mentry.getValue());
						
		}
		
	}
	
	

	
	
		

}
