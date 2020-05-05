package com.java.function;

import java.util.function.Function;

/*
 *  Function is predefined functional interface
 *  It has only one abstract method
 *  Public abstract R apply(T,R)
 * 	It will take two arguments and return any type
 * */

public class FunctionFirst {
	
	public static void main(String[] args) {
		//Function to return length of the string
		
		Function<String, Integer> function= i->i.length();
		int length=function.apply("sreenu");
		System.out.println("length of given String is:"+length);
		System.out.println("length of given String is:"+function.apply("malli"));
		
	}

}
