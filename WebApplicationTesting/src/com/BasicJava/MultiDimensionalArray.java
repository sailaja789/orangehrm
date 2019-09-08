package com.BasicJava;

public class MultiDimensionalArray 
{

	public static void main(String[] args) 
	{
		String array1[][]=new String[2][2];
		array1[0][0]="FunctionalTesting";
		array1[0][1]="VenkatSir";
		array1[1][0]="performanceTesting";
		array1[1][1]="srini";
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(array1[i][j]+"  ");
			}
			System.out.println(" ");
		}
		

	}

}
