package com.oopsconcept;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		double numArray[]= {12,34.5,123.3,-324.2,424.44,10.0};
		
		double largestArr =numArray[0];
		
		for (double num : numArray) {
			if(largestArr<num)
				largestArr=num;
			
				
		}System.out.println(largestArr);
		
		
	}

}
