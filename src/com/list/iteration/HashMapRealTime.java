package com.list.iteration;

import java.util.HashMap;

public class HashMapRealTime {

	public static void main(String[] args) {
		System.out.println(getUser("Admin"));
		System.out.println(getPass("Regular"));
	}
	
	public static HashMap getData() {
		
		HashMap<String,String> data=new HashMap<String,String>();
		data.put("Admin", "Admin1:Pass1");
		data.put("Regular", "Regular1:Pass2");
		return data;
	}
	public static String getUser(String role) {
		String cre=(String) getData().get(role);
		return cre.split(":")[0];
	}
	public static String getPass(String pass) {
		
		String psw=(String) getData().get(pass);
        return psw.split(":")[1];		
	}
}
