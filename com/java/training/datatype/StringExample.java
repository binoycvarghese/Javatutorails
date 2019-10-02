package com.java.training.datatype;

public class StringExample {

	
public static void main(String[] args) {
		
		String s1 = "Binoy";
		String s2 = "Binoy";
		String s3 = new String("Binoy");
		
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		
		String s4 = s3.intern(); 
		/** checks whether it exists in pool then returns that reference. 
		if not create a new on pool
		*/
		System.out.println(s1==s4);//true

	}
}
