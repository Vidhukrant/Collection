package com.list.session;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		
		int a[]=new int[3];  //Static Array-- Size fixed
		
		//Dynamic Array
		//1. Can contain duplicate value.
		//2. maintains insertion order
		//3. Synchronized -- Thread safe
		//4. Allow random access to fetch the element because it stores the values on the basis of indexes.
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(12);
		ar.add(20);
		ar.add(30);
		ArrayList ar7=new ArrayList();
		ar7.add("hello:");
		ar7.add("India:");
		
		ar.addAll(ar7);
		ar.removeAll(ar7);
		ar.retainAll(ar7);
		
		for(int p=0;p<=ar.size();p++) {
			
			System.out.println(ar.get(p));
		}
		
		System.out.println(ar.size()); // size of arraylist
		//System.out.println(ar.get(2)); // to get the value from an index
		
		ArrayList ar2=new ArrayList();
		ar2.add("test1");
		ar2.add("test2");
		ar2.add("test3");
		
		ArrayList ar3=new ArrayList();
		ar3.add("test4");
		ar3.add("test5");
		ar3.add("test6");
		
		ar2.addAll(ar3);// Will merger the list with ar2.
		ar2.removeAll(ar3);// will remove the list of ar3 from ar2
		ar2.retainAll(ar3);//will print comman value from both list
		
		for(int c=0;c<ar2.size();c++) {
			System.out.println(ar2.get(c));
		}
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
			Employee e1=new Employee("Vidhu", 27, "QA");
			Employee e2=new Employee("Tom", 25, "Dev");
			Employee e3=new Employee("Jerry", 29, "Admin");
			
			ArrayList<Employee> arr=new ArrayList<Employee>();
			arr.add(e1);
			arr.add(e2);
			arr.add(e3);
			
			//Iterator to traverse the value
			Iterator<Employee> it=arr.iterator();
			 
			while(it.hasNext()) {
				Employee emp=it.next();
				System.out.println(emp.name);
				System.out.println(emp.age);
				System.out.println(emp.dept);
			}
			
			
			}
		
	}
	
}
