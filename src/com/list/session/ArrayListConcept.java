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
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size()); // size of arraylist
		System.out.println(ar.get(2)); // to get the value from an index
		
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
