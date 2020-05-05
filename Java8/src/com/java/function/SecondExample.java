package com.java.function;

import java.util.function.Function;

public class SecondExample {

	public static void main(String[] args) {
		//Remove white spaces in given string
		
		Function<String, String> function=string->string.replaceAll(" ", "");
		String string_without_spaces=function.apply("hello how are you");
		System.out.println("String with out spaces:"+string_without_spaces);
		System.out.println("String with out spaces:"+function.apply("hello how are you"));
		
	}
}
