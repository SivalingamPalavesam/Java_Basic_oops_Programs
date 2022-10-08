package com.oopsconcept;

public class Computer {
	
	Computer()
	{
		System.out.println("This is Computer constructor");
	}
	void computer_method()
	{
		
		System.out.println("power gone , shut down your pc");
	}

	public static void main(String[] args) {
		
		Computer obj  = new Computer();
		
		obj.computer_method();
		
		Laptop obj1 = new Laptop();
		
		obj1.laptop_method();
		
	}

}
class Laptop
{
	Laptop()
	{
		System.out.println("This labtop constructor");
	}
	void laptop_method()
	{
		System.out.println("Charge is Full the laptop");
	}
}
