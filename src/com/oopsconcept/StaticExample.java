package com.oopsconcept;

public class StaticExample {
								
	
		static int a=5;
		static int b=6;
	
	
	public static void main(String[] args) {
		StaticExample obj = new StaticExample();
		obj.siva();
		StaticExample.sri();
	}
	public void siva()
	{
		int c = 14;
		System.out.println(a);
	}
	static void sri()
	{
		
		System.out.println(b);
	}
}
