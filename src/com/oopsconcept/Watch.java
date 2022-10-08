package com.oopsconcept;

import java.util.Scanner;

 abstract class Company
{
	//public static final int TotalRs= 0 ;
	
	//public static final int name =0;
	
	abstract void brandName();
	
	abstract void offer();
	static
	{
		System.out.println("Company  name is : \n   1 .FASTRACK \t 2.TITAN \t 3.SONATA \n");
	}
}
class Fastrack extends Company
{
	int TotalRs,userRs;
	 public void brandName() 
	  {
		 int watch_Rs;
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Company name  is :");
		 
		 int Cmp_name =input.nextInt();
		 
		 Scanner input1 = new Scanner(System.in);
		 
		 System.out.println("My Amount is  :");
		 
		  userRs =input1.nextInt();
		  
		  
		 
		 if( 1 == Cmp_name && 5000 < userRs  )
		 {
			 
			 System.out.println("YourFASTRACK watch Rs is  5000 only");
		 } 
		 
		 else if(2 == Cmp_name && 5000 < userRs)
		 {
			 System.out.println("Your TITAN watch Rs is  5000");
		 }
		 else if(3 == Cmp_name && 5000 < userRs)
		 {
			 System.out.println("Your SONATA watch Rs is  5000");
			 
		 }else
		 {
			 
			 System.out.println("Min Brand watch Rs is 5000");
		 }
		 
		 
		 
	  }
	 void offer()
	 {
		 
		  TotalRs = userRs - 100;
		  
		  System.out.println("This watch final Rs is " +TotalRs);
	 }
	
}
public class Watch
{
	public static void main(String[] args)
	{
		Fastrack obj = new Fastrack();
		
		obj.brandName();
		
		obj.offer();
		
		 
		
		
	}

}