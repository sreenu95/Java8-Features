package com.java.function;

import java.util.function.Function;

public class ThirdExample {
	public static void main(String[] args) {
		//count number of spaces in given string
		
		Function<String, Integer> function=string->string.length()-string.replaceAll(" ", "").length();
		System.out.println("number of white spaces in given string:"+ function.apply("s r e e n u"));
 	}

}
