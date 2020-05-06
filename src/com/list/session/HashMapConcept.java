package com.list.session;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Jmeter");
		hm.put(2, "Selenium");
		hm.put(3, "QTP");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(4));  // It will return null value instead of out of bound exception
		
		for(Entry m: hm.entrySet()) {
			
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		
		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		Employee e1=new Employee("Tom",21,"Dev");
		Employee e2=new Employee("Thomas",26,"Admin");
		Employee e3=new Employee("John",30,"QA");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer,Employee> m1: emp.entrySet()) {
			
			int a=m1.getKey();
			Employee e=m1.getValue();  //e pointing all the employee's class references.
			System.out.println(a + "Info");
			
			System.out.println(e.name+ " "+ e.age + " "+ e.dept);
		}

	}

}
