package com.oopsconcept;

import java.util.Scanner;

class Bank1 {
	 
	int rateOfYear =12;
	
	int Saving_amount  , years  ,totalInterst_amount ,TotalAmount;
	
	public void getRateOfIntrest()
	{}
	
}
class SbIs extends Sbi
{
	public void getRateOfIntrest()
	{
		rateOfInterest();
	}
}
class IcIcI extends Bank1
{
	public void getRateOfIntrest()
	{
		int icicirateOfYear =15;
		
		 System.out.println("**************************************" );
		
		Scanner input = new Scanner(System.in);
				 
		 System.out.println("ICICI Saving amount is  :" );
		 
		 Saving_amount =input.nextInt();
		 
		 Scanner input1 = new Scanner(System.in);
		 
		 System.out.println("Total years is  :" );
		 
		 years =input1.nextInt();
		 
		 
		 totalInterst_amount =  (Saving_amount * icicirateOfYear * years) / 100 ;
		 
		 
		 System.out.println(years+" years total intrest amount is : "+totalInterst_amount );
		 
		 TotalAmount = totalInterst_amount + Saving_amount;
		 
		 System.out.println("ICICI total saving amount is  :"+TotalAmount);
		
	}
}
class Axis extends Bank1
{
	public void getRateOfIntrest()
	{
		int axisrateOfYear =22;
		
		System.out.println("**************************************" );
		
		Scanner input = new Scanner(System.in);
		 
		 System.out.println("AXIS Saving amount is  :" );
		 
		 Saving_amount =input.nextInt();
		 
		 Scanner input1 = new Scanner(System.in);
		 
		 System.out.println("Total years is  :" );
		 
		 years =input1.nextInt();
		 
		 
		 totalInterst_amount =  (Saving_amount * axisrateOfYear * years) / 100 ;
		 
		 
		 System.out.println(years+" years total intrest amount is : "+totalInterst_amount );
		 
		 TotalAmount = totalInterst_amount + Saving_amount;
		 
		 System.out.println("Axis total saving amount is  :"+TotalAmount);
	}
}
public class BankOverrideProg {

	public static void main(String[] args) {
		
		SbIs obj = new SbIs();
		 
		IcIcI obj1 = new IcIcI();
		
		Axis obj2 = new Axis();
		
		obj.getRateOfIntrest();
		
		obj1.getRateOfIntrest();
		 
		obj2.getRateOfIntrest();
	}

}
