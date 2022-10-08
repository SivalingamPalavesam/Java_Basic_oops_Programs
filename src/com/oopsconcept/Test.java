package com.oopsconcept;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]){
		List list=new ArrayList();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");
		list.forEach((n)->System.out.print(n+","));
	}
	
}

