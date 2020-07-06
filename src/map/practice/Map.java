package map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();  
		arr.add("hello");
		arr.add("India");
		arr.add("Java");
		arr.add("Selenium");
		//System.out.println(arr.get(3));
		System.out.println("Using for each with lambda expression");
		
		arr.forEach(arr1 ->{
			System.out.println(arr1);
		});
		
		System.out.println("Using Iterator");
	     Iterator it=arr.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }
	     
	     System.out.println("Using for each remaining with lambda expression");
	     Iterator it1=arr.iterator();
	     it1.forEachRemaining(arr2->{
	    	 System.out.println(arr2);
	     });
	     
	     System.out.println("++++++++Using indexes");
	     for(int i=0;i<arr.size();i++) {
	    	 System.out.println(arr.get(i));
	     }
	     System.out.println("========Using list iterator");
	     ListIterator it3=arr.listIterator(arr.size());
	     while(it3.hasPrevious()) {
	    	 System.out.println(it3.previous());
	     }
		
		
	}}

