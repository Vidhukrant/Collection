package com.list.session;

import java.util.HashMap;
import java.util.Set;

public class StringCounting {

	public static void main(String[] args) {
		findDuplicateValue("assdhfdgfjhfjdghjbhjfgjhfuffhf");

	}
	
	public static void findDuplicateValue(String s) {
		//Split string
		String ar[]=s.split("");
		//Create one hashmap

	      // prints the substring after index 7 till index 17
		
		HashMap<String, Integer> map=new HashMap<String,Integer>();
		//to check each word in given array
		for(String word:ar) {
			
			//if word is present
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		//Extracting all the keys of map
		Set<String> Counts=map.keySet();
		//loop through all the words in array
		for(String s1:Counts) {
			if(map.get(s1)>=1) {
				System.out.println(s1+ "  "+map.get(s1));
			}
		}
	}
}
