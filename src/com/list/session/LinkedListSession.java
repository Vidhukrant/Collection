package com.list.session;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSession {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		//Add:
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("Devops");
		
		//Print:
		System.out.println("Content of linked list:" + ll);
		
		//Add First:
		ll.addFirst("First");
		//Add Last
		ll.addLast("Last");
		System.out.println("Content of linked list:" + ll);
		//Get Value:
		System.out.println(ll.get(1));
		//Set Value:
		ll.set(1, "Tom");
		System.out.println(ll.get(1));
		
		//Remove first and last element
		ll.removeFirst();
        ll.removeLast();
        System.out.println("Content of linked list:" + ll);
        //Remove particular element 
       // ll.remove(2);
        System.out.println("Content of linked list:" + ll);
        
        for(int i=0;i<=ll.size();i++) {
        	System.out.println(ll.get(i));
        }
        
        for(String s4 : ll) {
        	System.out.println(s4);
		}
        System.out.println("using iterator");
        Iterator<String> it=ll.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        System.out.println("Using while loop");
        int num=0;
        while(ll.size()>0) {
        	
        	System.out.println(ll.get(num));
        	num++;
        }
	}

}
