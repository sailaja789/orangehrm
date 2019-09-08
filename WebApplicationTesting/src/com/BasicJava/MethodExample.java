package com.BasicJava;

public class MethodExample 
{
		//Global variables
		int a=10;
		int b=5;
		int c;
		public void addition()
		{
			c=a+b;
			System.out.println("the addition of two numbers is "+c);
		}
		public void subtraction()
		{
			//Local variables
			int a=10;
			int b=5;
			int c;
			c=a-b;
			System.out.println("the subtraction of two numbers is"+c);
		}
		public void multiplication()
		{
			int a=20;
			int b=5;
			int c;
			c=a*b;
			System.out.println("the multiplication of two numbers is"+c);
		}
		public void division()
		{
			int a=5;
			int b=0;
			int c;
			c=a/b;
			System.out.println("the division of two numbers is"+c);
		}
		public static void main(String []args)
		{
			MethodExample m=new MethodExample();
			m.addition();
			m.subtraction();
			m.multiplication();
			m.division();
	}

}
