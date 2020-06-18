package com.list.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A {

	public static void main(String[] args) {
	  
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Hello");
		arr.add("India");
		arr.add("Bharat");
		
		System.out.println("=======Using for each with lamda========");
		arr.forEach(ar1 ->{
			System.out.println(ar1);
		});
		System.out.println("=====Using Iterator=======");
		Iterator<String>it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==========Using for each==========");
		for(String s1:arr) {
			System.out.println(s1);
		}
		System.out.println("=========Using for each remaining with lamda");
		Iterator<String>it1=arr.iterator();
		it1.forEachRemaining(ar2 -> {
			System.out.println(ar2);
		});
		System.out.println("=======Using index number========");
		for(int a=0;a<arr.size();a++) {
			System.out.println(arr.get(a));
		}
		System.out.println("======Using List iterator with lamda=========");
		ListIterator<String> lt=arr.listIterator(arr.size());
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}
}
