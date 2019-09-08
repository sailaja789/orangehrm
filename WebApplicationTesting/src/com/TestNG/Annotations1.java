package com.TestNG;
import org.testng.annotations.Test;
public class Annotations1 
{
	@Test(priority=1)
	public void inbox()
	{
		System.out.println("testing inbox functionality");
	}
	@Test(priority=3)
	public void sentmail()
	{
		System.out.println("testing sentmail functionality");
	}
	@Test(priority=2)
	public void drafts()
	{
		System.out.println("testing drafts functionality");
	}
	@Test(enabled=false)
	public void composemail()
	{
		System.out.println("testing composemail functionality");
		
	}

}
