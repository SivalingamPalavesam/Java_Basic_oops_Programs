package com.oopsconcept;

public class ExceptionHandling {

	public static void main(String[] args) {


		int a = 10, b= 0;

		String str = null;

		int d[] = {1,2};  //(0,1,2)

		try {

			System.out.println(d[2]);

			System.out.println(str.length());

			int c = a/b;

			System.out.println("value of c is " + c );

		}
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("rest of code");

		System.out.println("rest of code");


		System.out.println("rest of code");


		System.out.println("rest of code");

		System.out.println("rest of code");
	}
}


