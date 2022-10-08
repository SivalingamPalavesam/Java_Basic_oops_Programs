package com.oopsconcept;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num =  7;
		boolean name =false; 
		for(int i = 2;i<=num/2;++i)
		{
			if(num % i == 0)
			{
				name =true;
				break;
			}
			
		}
		if(!name)
		{
			System.out.println("is prime no");
			
		}else
		{
			System.out.println("Not a prime no");
		}
	}

}
