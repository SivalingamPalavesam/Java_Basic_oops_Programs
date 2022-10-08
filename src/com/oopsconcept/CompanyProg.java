package com.oopsconcept;

class Person{
	String name ;
	int id; 
	
	Person()
	{
		this.name =  name;
		this.id =  id;
	}
	
}
class EmployeeDetail  extends Person
{
	 float emp_salary = 10000;	 
	public void salary()
	{
		
		System.out.println("Emp details  is  :");
		
	}
}



public class CompanyProg {

	public static void main(String[] args) {
		
		EmployeeDetail  obj  = new EmployeeDetail();
		
		obj.salary();
		

	}

}
