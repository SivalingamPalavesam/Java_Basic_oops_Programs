package com.oopsconcept;

import java.util.Scanner;

interface BankDetails {
	
	int rateOfYear =12;
	
	public abstract void rateOfInterest();

}
class Sbi implements BankDetails
{
	int Saving_amount  , years  ,totalInterst_amount ,sbiTotalAmount;
	
	public  void rateOfInterest()
	{
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Saving amount is  :" );
		 
		 Saving_amount =input.nextInt();
		 
		 Scanner input1 = new Scanner(System.in);
		 
		 System.out.println("Total years is  :" );
		 
		 years =input1.nextInt();
		 
		 
		 totalInterst_amount =  (Saving_amount * rateOfYear * years) / 100 ;
		 
		 
		 System.out.println(years+" years total intrest amount is : "+totalInterst_amount );
		 
		 sbiTotalAmount = totalInterst_amount + Saving_amount;
		 
		 System.out.println("SBI total saving amount is  :"+sbiTotalAmount);	
	}
	
}
class Bank
{
	public static void main(String[] args) 
	{
		Sbi sbi = new Sbi();
		sbi.rateOfInterest();
	}
}