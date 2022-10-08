package com.oopsconcept;

public class InfinityLoop {

	public static void main(String[] args) {
		
		for(;;)
		{
			System.out.println("Infinity loop in for");
			break;
		}
		while(true)
		{
			System.out.println("Infinity loop in while");
			break;
		}
	}

	
}
