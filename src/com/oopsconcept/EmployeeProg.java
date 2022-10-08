package com.oopsconcept;

import java.util.Scanner;

class Emp
 {
	 float empSalary;
	 int empbonus;
	 float totalSalary;
	 
	 public void salary()
	 {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Employee salary is  :" );
		 
		 empSalary =input.nextFloat();
	 }
 }
 class Programmer extends Emp
 {
	 public void empBonusmethod()
	 {
		 
		 	 Scanner input1 = new Scanner(System.in);
			 
			 System.out.println("Employee Bonus ammout is  :" );
			 
			 empbonus =input1.nextInt();
		 
			 totalSalary = empSalary + empbonus;
		 
			 System.out.println("The Employee total salary is   :"  +totalSalary);
		 
	 }
	 
 }
 

public class EmployeeProg {

	public static void main(String[] args) {
		 
		Programmer obj =new  Programmer();
		obj.salary();
		obj .empBonusmethod();
		
	}

}
