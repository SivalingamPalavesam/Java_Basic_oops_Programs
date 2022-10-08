package com.oopsconcept;


public class VowelsProgram {

	public static void main(String[] args) {
		 
	String str = "SIVALINGAM";
		
	boolean siv = str.toLowerCase().matches(".*[aeiou].*");
	
	System.out.println(siv);
	}

}
