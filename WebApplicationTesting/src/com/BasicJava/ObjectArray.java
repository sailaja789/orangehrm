package com.BasicJava;

public class ObjectArray 
{

	public static void main(String[] args)
	{
		Object array1[]=new Object[4];
		array1[0]=10;
		array1[1]="Hello";
		array1[2]=12.345;
		array1[3]='a';
		for(int i=0; i<4; i++)
		{
			System.out.println(array1[i]);
		}
		

	}

}
