package com.oopsconcept;

public class StriingRev {

	public static void main(String[] args) {
		 
		String s = "ABC";
		String s1 = "DE";
		
		//StringBuffer obj = new StringBuffer();
		
		 int lengthValue = s.length();
		  
		 int lengthValue1 =s1.length();
		
		 for(int i = lengthValue-1 ; i>=0  ; i--)
		 {
			 
			 System.out.print(s.charAt(i));
			 
		 }
		 for (int i =lengthValue1-1 ;i>=0 ;--i)
		 {
			 System.out.print(s1.charAt(i));
		 }
		 
		  
	}

}
