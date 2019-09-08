package com.BasicJava;

public class IfElseIf 
{

	public static void main(String[] args) 
	{
	int x=10;
	int y=20;
	int z=30;
	if(x>y && x>z)
	{
		System.out.println("x is greater than y and z");
	}
	else
		if(y>x && y>z)
		{
			System.out.println("y is greater than x and z");
		}
		else
			System.out.println("z is greater than x and y");		

	}

}
