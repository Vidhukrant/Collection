package com.string.manipulation;

public class HighestIntegerNumber {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,-21,500,-10,-321};
		
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>largest) {
				
				largest=a[i];
			}
			else if(a[i]<smallest)
				smallest=a[i];
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
	
}
