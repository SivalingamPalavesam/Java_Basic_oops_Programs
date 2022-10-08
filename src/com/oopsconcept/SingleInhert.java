package com.oopsconcept;

class SingleInherit
{
	String name;
	
	public void baseClass()
	{
		System.out.println("This Super class method");
	}

}
class SingleInheritSubclass extends SingleInherit
{
	public void subClass()
	{
		
		System.out.println("This sub class method");
		super.baseClass();
	}

}
class MultilevInherit extends SingleInheritSubclass
{
	public void MulLevInher()
	{
		System.out.println("This is Multilevel Inheritence  :" +name);
		
	}

}
public class SingleInhert {

	public static void main(String[] args) {
		
		MultilevInherit obj = new MultilevInherit();
		obj.name ="java";
		obj.MulLevInher();
		obj.subClass();
		
		
	}

}
