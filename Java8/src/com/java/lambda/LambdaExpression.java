package com.java.lambda;

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		Runnable runnable=()->{
			for(int i=0;i<10;i++) {
				System.out.println("from child");
			}
		};
		
		Thread thread=new Thread(runnable);
		thread.start();
		System.out.println("from main");
		
	}
}
