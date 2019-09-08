package com.BasicJava;

public class IfElseIf1 {

	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		int z=20;
		if(x>y && x>z)
		{
			System.out.println("x is greater than y and z");
		}
		else
			if(y>x && y>=z )
			{
				System.out.println("y is equals to z");
			}
			else
			{
				System.out.println("z is greater than x and y");

			}
	}

}
//if condition is true that will executed 
//if condition is false that will go to the else part than it will check the if condition if it is true 
// that will executed if it is false it will go to the else part