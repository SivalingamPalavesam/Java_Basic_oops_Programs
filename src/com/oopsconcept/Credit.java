package com.oopsconcept;

import java.util.*;

public class Credit {
	
	static int userAmt;
	
	 
	public void creditUser()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("User Rs is  :");
		
		userAmt  = input.nextInt();
		
		float remaingamt  =  userAmt ;
		
		
		if(userAmt >= 5000 || remaingamt >5000 )
		{
			System.out.println("Car Engine Prizes");
			
		}
		if(userAmt >= 4000 || remaingamt >4000)
		{
			System.out.println("Car Suspension Prizes");			
		}	
		if(userAmt >= 3000 || remaingamt >3000)
		{
			System.out.println("Car tyre Prizes");
		}	
		if(userAmt >= 2000 || remaingamt >2000)
		{
			System.out.println("Car Music system Prizes");	
		}
		else
		{
			System.out.println("Not Enough Rs");
			
		}

		
	}

	public static void main(String[] args) {
		
		Credit obj = new Credit();
		obj.creditUser();
				
		
	}

}
