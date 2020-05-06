package com.list.session;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableConcept {
	
	public static void main(String[] args) {
		
		Hashtable h1=new Hashtable();
		h1.put(1, "Test");
		h1.put(2, "Dev");
		h1.put(3, "QA");
		
		//Clone the object
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();
		
		System.out.println("The value from h1:"+h1);
		System.out.println("The value from h2:"+h2);
		
		//Clear hashtable
		h1.clear();
		System.out.println("The value from h1:"+h1);
		System.out.println("The value from h2:"+h2);
		
		//Contains Value/Key
		Hashtable s=new Hashtable();
		s.put(1, "JAVA");
		s.put(2, "C#");
		if(s.containsValue("JAVA")) {
			System.out.println("Value found");
			
			}
		//Print all the values
		Enumeration e=s.elements();
		System.out.println("The value from s:");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
			
		}
		//Compare 2 tables
		Hashtable s2=new Hashtable();
		s2.put(1, "JAVA");
		s2.put(2, "C#");
		if(s.equals(s2)) {
			System.out.println("tables are same");
		}

	}

}
