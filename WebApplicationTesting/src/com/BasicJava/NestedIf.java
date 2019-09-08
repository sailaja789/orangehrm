package com.BasicJava;

public class NestedIf 
{

public static void main(String[] args) 
{
  int a=30;
  int b=20;
  int c=40;
  if(a>b)
  {
	  if(a==c)
	  {
		  System.out.println("the value of a is:"+a);
	  }
	  else
	  {
		  System.out.println("the value of b is:"+b);
	  }
  }
	}

}
//if first if condition is false it will terminated and output is blank
//if first if condition is true it will go to the next if if it is true that statement will executed 
//if it false it will go to the else part and it will print that part*/