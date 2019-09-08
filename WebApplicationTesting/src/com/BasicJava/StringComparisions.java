package com.BasicJava;

public class StringComparisions
{

	public static void main(String[] args) 
	{
		String String1="LiveTech";
		String String2="LiveTech";
		if(String1.equals(String2))
		{
			System.out.println("Both Strings are Equal");
		}
		else
		{
			System.out.println("Both Strings are notequal");
		}
		String String3="LiveTech";
		String String4="Livetech";	
		if(String3.equals(String4))
		{
			System.out.println("Both Strings are Equal");
		}
		else
		{
			System.out.println("Both Strings are not equal");
		}

		String String5="LiveTech";
		String String6="LiveTech";
		if(String5.equalsIgnoreCase(String6))
		{
			System.out.println("Both strings are Equal"); 
		}
		else
		{
			System.out.println("Both Strings are not equal");
		}
		String String7="LiveTech";
		String String8="Livetech";
		if(String7.equalsIgnoreCase(String8))
		{
			System.out.println("Both Strings are Equal");
		}
		else
		{
			System.out.println("Both Strings are not equal");
		}
		String String9="LiveTech";
		String String10="Live";
		if(String9.contains(String10))
		{
			System.out.println("String Existing");
		}
		else
		{
			System.out.println("String not Found");
		}
		String String=("VenkatSir");
		int StringLength=StringLength();
		System.out.println("The length of the String is :+StringLength");
		
		}
	private static int StringLength() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	}
	


