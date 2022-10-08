package com.oopsconcept;

import java.util.HashMap;
import java.util.Map;

public class FindTheLetter {

	public static void main(String[] args)
	{
		String str ="Java is a programming";
		String whiteSpace = str.replaceAll("\\s","");
		
		char[] split = whiteSpace.toCharArray();
		 
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i = 0 ; i < split.length ; i++)
		{
			if(map.containsKey(split[i]))
			{
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}
			else
			{
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}

}
