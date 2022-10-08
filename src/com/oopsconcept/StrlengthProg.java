package com.oopsconcept;

import java.util.Scanner;

public class StrlengthProg {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		
		String s = sc.next();
		
		int n =s.length();
		
		StringBuffer sb =new  StringBuffer();
		
		for(int i=0;i<n;i++) 
		{
			 sb.append(s).reverse();
			 break;
		}
		
		System.out.println("the reversed string is: "+sb);
		
		System.out.println("The substring is: "+sb.substring(n/2,(n/2)+3));


	}

}
