package com.oopsconcept;

import java.util.ArrayList;
import java.util.List;

public class SupStringPalind 
{
	public static void main(String[] args) {
		
		String str = "formadamfor";
		String val ="";
		int count = str.length();
		
		char[] arr = str.toCharArray();
		for(int i = 0 ; i <=str.length();i++)
		{
			for(int j =count-1 ;j>=0; j--)
			{
				System.out.println("arr[i]===>"+ arr[i]);
				System.out.println("arr[j]===>"+arr[j]);
				if(arr[i] == arr[j])
				{	
					System.out.println(arr[i]);
					break;
				}
				else
				{
					
				}
			}
			
		}
	}
}
