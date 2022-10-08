package com.oopsconcept;

public class StudentClass {
	
	int id;
	String strName;
	
	public void value()
	{
		id = 123 ;
		strName = "guru";
		
	}
	public void display()
	{
		value();
		System.out.println("Student id is  :"+id);
		System.out.println("Student name is :"+strName);	
	}
	
	public static void main(String[] args) {
		
		
		StudentClass obj = new StudentClass();
		obj.display();
		obj.display();
		obj.display();
	}

}
