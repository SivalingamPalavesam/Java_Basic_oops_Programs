package com.oopsconcept;

import java.util.*;

public class StrUppercase {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("The String Value is  :");
		
		String s =input.nextLine();
		
		int lengthValue = s.length();
		
		//System.out.println(lengthValue);
		
		for(int i = lengthValue-1 ; i >= 0 ; i--)
			
		{
			System.out.print(s.toUpperCase());			
		}
		
	}

}
