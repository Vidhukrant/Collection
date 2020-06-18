package com.list.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Selenium");
		ar.add("Java");
		ar.add("Python");
		ar.add("C++");
		
		ar.forEach(ar1 ->{
			System.out.println(ar1);
		});
		
		System.out.println("========Using Iterator=======");
		Iterator it=ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=======Using for each loop========");
		for(String s1:ar) {
			System.out.println(s1);
		}
		
		System.out.println("=======Using for each remaining with lamda========");
		Iterator<String>it1=ar.iterator();
		it1.forEachRemaining(ar2 ->{
			System.out.println(ar2);
		});
		System.out.println("==========Using Index number========");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("========Using List iterator=========");
		ListIterator it3=ar.listIterator(ar.size());
		while(it3.hasPrevious()) {
			System.out.println(it3.previous());
		}
		
	}
}
