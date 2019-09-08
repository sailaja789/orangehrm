package com.BasicJava;

public class ExceptionHandling 
{
	int a=10;
	int b=0;
	int c;
	public void division() {
	}
	{
		try
		{
			c=a/b;
			System.out.println("the value of c is:"+c);
		}
		catch(Exception p)
		{
			System.out.println(p);
		}
	}
	public static void main(String []args)
	{
		ExceptionHandling c=new ExceptionHandling();
		c.division();
		System.out.println("Sailaja");
	}


}	


