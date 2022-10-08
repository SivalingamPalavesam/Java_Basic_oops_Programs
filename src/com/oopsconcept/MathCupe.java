package com.oopsconcept;

import java.util.Scanner;

public class MathCupe {

	static int n ,i ;
	
	public static void main(String[] args) {
		
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Any Number :" );
		 
		 i =input.nextInt();
		 
		// n = i * i * i ;
		 
		 System.out.println("The cupe value is  :"+Math.pow(i, 3));

	}

}
